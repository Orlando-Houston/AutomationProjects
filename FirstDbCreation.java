import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


import java.sql.*;

    public class FirstDbCreation
    {
        public  static Connection conn;
        public static Statement statement;


        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            String connectionString="jdbc:mysql://localhost:3306/nau";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection (connectionString,"root","afhara1234");
            // DatabaseMetaData
            statement=conn.createStatement ();
            String createDBSQ="create database nau2;";
            statement.executeUpdate (createDBSQ);
            System.out.println ("done");

        }
    }


