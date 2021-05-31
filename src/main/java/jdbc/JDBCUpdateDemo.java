package   jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: Samuel
 * @date: 2021/4/7 17:55
 */
public class JDBCUpdateDemo {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        String updateSql="update `users` set`email`='2333@qq.com',`birthday`='1996-12-12' where `id`=3;";
        String querySql="select * from users;";
        try {
            connection=JDBCUtils.getConnection();
            statement=connection.createStatement();
            int update=statement.executeUpdate(updateSql);
            if(update>0) {
                System.out.println(update + "条数据更新完成");
                System.out.println("===================");
            }
            resultSet=statement.executeQuery(querySql);
            while(resultSet.next()){
                System.out.println("id:\t"+resultSet.getInt("id"));
                System.out.println("name:\t"+resultSet.getString("name"));
                System.out.println("password:\t"+resultSet.getString("password"));
                System.out.println("email:\t"+resultSet.getString("email"));
                System.out.println("birthday:\t"+resultSet.getDate("birthday"));
                System.out.println("=====================");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.release(connection,statement,resultSet);
        }
    }
}
