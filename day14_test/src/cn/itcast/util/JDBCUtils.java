package cn.itcast.util;

//JDBC工具類 使用Durid連接池

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    private static DataSource ds;


    static {
        try {
            //1.加載配置文件
            Properties pro = new Properties();
            //使用ClassLoader加載配置文件，獲取文字節輸入流
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);

            //2.初始化連接池對象
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //獲取連接池對象
    public static DataSource getDataSource(){

        return ds;
    }

    //獲取連接Connection對象
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }
}
