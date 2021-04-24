package November2SatMsql;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import static November2SatMsql.ExcelInsert.preStatement;

public class InsertTable {
    private static Connection conn;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        BaseConn myBase=new BaseConn ();
        conn=myBase.getConnection ();
        String insert="insert into nau2.student"+
                "(student_id,"+
                "(student_name,"+
                "(studentgrade_id,"+
                "(creation_id)"+
                "values(?,?,?,?)";
        preStatement=conn.prepareStatement (insert);
        preStatement.setInt (1,1);
        preStatement.setString (2,"Ahmet ihsan");
        Date date=new Date ();
        preStatement.setTimestamp (4,new Timestamp (date.getTime ()));
        preStatement.executeUpdate ();
        System.out.println ("done");


    }
}
