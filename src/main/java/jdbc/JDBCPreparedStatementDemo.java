package   jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * @author: Samuel
 * @date: 2021/4/7 18:46
 */
public class JDBCPreparedStatementDemo {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        String querySql="select * from `users` where `id`=? and `name`=? and `password`=? and `email`=? and `birthday`=?";
        Calendar calendar=Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR,1997);
        calendar.set(Calendar.MONTH,2);
        calendar.set(Calendar.DAY_OF_MONTH,23);
        try {
            connection=JDBCUtils.getConnection();
            preparedStatement=connection.prepareStatement(querySql);//预编译sql，先写sql，然后不执行
            //手动给参数赋值
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"李四");
            preparedStatement.setString(3,"123456");
            preparedStatement.setString(4,"121@qq.com");
            //此处使用的是数据库日期类型sql.Date,要将Java日期类型util.Date转换后才能使用
            preparedStatement.setDate(5,new java.sql.Date((calendar.getTime()).getTime()));

            //执行
            //PreparedStatement防止sql注入的本质就是把传入的参数当作字符，如果参数中有转义字符会被转义，使恶意的参数无法实现其功能
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("id:"+resultSet.getInt("id"));
                System.out.println("name:"+resultSet.getString("name"));
                System.out.println("password:"+resultSet.getString("password"));
                System.out.println("email:"+resultSet.getString("email"));
                System.out.println("birthday:"+resultSet.getDate("birthday"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.release(connection,preparedStatement,resultSet);
        }
    }
}
