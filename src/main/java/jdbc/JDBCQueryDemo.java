package   jdbc;

import java.sql.*;

/**
 * @author: Samuel
 * @date: 2021/4/7 16:16
 */
public class JDBCQueryDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.用户信息和url
        String url="jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String username="root";
        String password="123456";

        //3.连接成功，获取数据库对象
        /*
        Connection就代表数据库，
        可以通过它设置数据库自动提交，事务提交，事务回滚
         */
        Connection connection= DriverManager.getConnection(url,username,password);

        //4.获取执行sql语句的对象
        Statement statement=connection.createStatement();


        //5.用执行sql语句的对象 去 执行sql语句
         /*
           statement.executeQuery();//查询操作，返回结果
           statement.execute();//执行任何sql
           statement.executeUpdate();//用于更新、插入、删除，返回受影响行数

           resultSet.getObject();//不知道列类型的情况下使用，知道类型则使用具体方法
           resultSet.getInt();
           resultSet.getString();
           resultSet.getDouble();
           resultSet.getFloat();
           resultSet.getDate();
           resultSet.beforeFirst();//移动到最前面
           resultSet.afterLast();//移动到最后面
           resultSet.next();//移动到下一个数据
           resultSet.previous();//移动到上一个数据
           resultSet.absolute(row);//移动到指定行
         */
        String sql="select * from users where `name`='' or '1=1'";//sql注入
        ResultSet resultSet=statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("name="+resultSet.getObject("name"));
            System.out.println("password="+resultSet.getObject("password"));
            System.out.println("email="+resultSet.getObject("email"));
            System.out.println("birthday="+resultSet.getObject("birthday"));
            System.out.println("====================");
        }

        //6.释放连接,必须及时关闭各种连接
        resultSet.close();
        statement.close();
        connection.close();//十分耗资源
    }
}
