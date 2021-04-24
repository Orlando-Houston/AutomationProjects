package November2SatMsql;

import java.io.File;


    import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.sql.*;
import java.util.Date;

    public class ExcelInsert
    {
        public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
            File file=new File ("");
            FileInputStream fs=new FileInputStream(file);
            XSSFWorkbook wb=new XSSFWorkbook(fs);
            XSSFSheet sh=wb.getSheet("mysql");
            int rowCount=sh.getLastRowNum();
            for (int i = 1; i <= rowCount; i++) {
                Row rw=sh.getRow(i);
                Cell studentId=rw.getCell(0);
                Cell studentName=rw.getCell(1);
                Cell studentGradeId=rw.getCell(2);
                insertStudentTable(studentId.getNumericCellValue(),
                        studentName.getStringCellValue(),
                        studentGradeId.getNumericCellValue());

                Cell recorded=rw.createCell(3);
                recorded.setCellValue("recorded");
                fs.close();
                FileOutputStream fos=new FileOutputStream(file);
                wb.write(fos);
                fos.close();
            }
        }
        public static Connection myConn;
        public static PreparedStatement preStatement;

        public static void insertStudentTable(double studentId,String studentName,double studentGradeId) throws SQLException, ClassNotFoundException {
            BaseConn myBase=new BaseConn();
            myConn=myBase.getConnection();
            String insert="insert into nau2.student " +
                    "(student_id," +
                    "student_name," +
                    "studentgrade_id," +
                    "creation_date ) " +
                    "values(?,?,?,?);";
            preStatement=myConn.prepareStatement(insert);
            preStatement.setInt(1,(int)studentId);
            preStatement.setString(2,studentName);
            preStatement.setInt(3,(int)studentGradeId);
            Date date=new Date();
            preStatement.setTimestamp(4,new Timestamp(date.getTime()));
            int recordAdded=preStatement.executeUpdate();
            if (recordAdded>0)
            {
                System.out.println("added");
            }
        }
    }




