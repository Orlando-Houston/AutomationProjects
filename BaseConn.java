package November2SatMsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseConn {
    public static Connection conn;
    public  Connection getConnection() throws ClassNotFoundException, SQLException {
        String connString="jdbc:mysql://localhost:3306/nau2";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn= DriverManager.getConnection(connString,"root","afhara1234");
        return conn;
    }
}
