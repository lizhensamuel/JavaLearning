package   jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: Samuel
 * @date: 2021/4/7 21:33
 */
public class JDBCTransactionDemo {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            connection=JDBCUtils.getConnection();

            //关闭数据库自动提交，会自动开启事务
            connection.setAutoCommit(false);
            String sql1="update account set`money`=`money`-100 where `name`='A'";
            preparedStatement=connection.prepareStatement(sql1);
            preparedStatement.executeUpdate();

            int x=1/0;

            String sql2="update account set`money`=`money`+100 where `name`='B'";
            preparedStatement=connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

            //业务完毕，提交事务
            connection.commit();
            System.out.println("事务执行成功");

        } catch (Exception throwables) {
            try {
                connection.rollback();//默认失败则回滚，可以不用显示定义回滚
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("事务执行失败，已回滚");
            throwables.printStackTrace();
        }finally {
            JDBCUtils.release(connection,preparedStatement,resultSet);
        }

    }
}
