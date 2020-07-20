package cn.itcast.util;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDataSource extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static DataSource ds;
    Connection dbconn = null;

    @Override
    public void init() throws ServletException {

        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dburl = "jdbc:sqlserver://localhost:1433:DatabaseName=day14";
        String username = "SA";
        String password = "Love0713";

        try {
            Class.forName(driver);
            System.out.println("數據庫驅動加載成功");
            dbconn = DriverManager.getConnection(dburl,username,password);
            System.out.println("數據庫連接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
