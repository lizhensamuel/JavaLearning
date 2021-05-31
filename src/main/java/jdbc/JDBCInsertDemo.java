package   jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: Samuel
 * @date: 2021/4/7 17:28
 */
public class JDBCInsertDemo {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        int i=5;
        String insertSql="insert into users(`id`,`name`,`password`,`email`,`birthday`) values('"+i+"','匿名"+i+"','123456','111@qq.com','1999-01-01');";
        String querySql="select * from users;";
        try {
            connection=JDBCUtils_C3P0.getConnection();
            statement=connection.createStatement();
            int update=statement.executeUpdate(insertSql);
            if(update>0) {
                System.out.println(update + "条数据插入完成");
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
            JDBCUtils_C3P0.release(connection,statement,resultSet);
        }





    }
}
