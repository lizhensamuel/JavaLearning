package   jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: Samuel
 * @date: 2021/4/8 10:30
 */
public class JDBCUtils_C3P0 {
    private static ComboPooledDataSource dataSource=null;

    static {
        try {
            //手动配置写法
//            dataSource =new ComboPooledDataSource();
//            dataSource.setDriverClass();
//            dataSource.setUser();
//            dataSource.setPassword();
//            dataSource.setJdbcUrl();
//
//            dataSource.setInitialPoolSize();
//            dataSource.setMaxPoolSize();
//            dataSource.setMinPoolSize();


            //创建数据源
            dataSource = new ComboPooledDataSource("MySQL");//配置文件写法

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取数据库连接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();//从数据源中获取连接
    }

    //释放资源
    public static void release(Connection conn, Statement st, ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
