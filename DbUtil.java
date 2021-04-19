package Common.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbUtil {
    public static  int  getNumberOfCarsFromDb() {

        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection ("jdbc:mysql://95.217.14.25:3306/dealerlot"
                    , "testuser"
                    , "Password@1");
            Statement statement = conn.createStatement ();
            String sampleQuery = "SELECT * FROM cars";
            ResultSet rs = statement.executeQuery (sampleQuery);
            int count=0;
            while (rs.next ()){
                count ++;
            }
            return count;

        }
        catch (Exception e) {
            e.printStackTrace ();
        }
        return 0;

    }
    public boolean doesStockExistInDb(int stockNumber){
        return true;
    }
}
