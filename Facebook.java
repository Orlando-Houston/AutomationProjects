package Homework;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Facebook {
    public static void main(String[] args) throws IOException {


        File src = new File("C:\\ExcelData\\face.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sht1=wb.getSheet("facebook");


        System.out.println(sht1.getRow(0).getCell(0).getStringCellValue());//read//yazdigim datayi cagiriyorum
        System.out.println(sht1.getRow(0).getCell(1).getStringCellValue());
        System.out.println(sht1.getRow(0).getCell(2).getStringCellValue());
        System.out.println(sht1.getRow(1).getCell(0).getStringCellValue());
        System.out.println(sht1.getRow(2).getCell(0).getStringCellValue());
        System.out.println(sht1.getRow(3).getCell(0).getStringCellValue());
        System.out.println(sht1.getRow(4).getCell(0).getStringCellValue());


       System.out.println(sht1.getRow(1).getCell(1).getStringCellValue());
        System.out.println(sht1.getRow(2).getCell(1).getStringCellValue());
        System.out.println(sht1.getRow(3).getCell(1).getStringCellValue());
        System.out.println(sht1.getRow(4).getCell(1).getStringCellValue());



        System.out.println(sht1.getRow(1).getCell(2).getStringCellValue());
        System.out.println(sht1.getRow(2).getCell(2).getStringCellValue());
        System.out.println(sht1.getRow(3).getCell(2).getStringCellValue());
        System.out.println(sht1.getRow(4).getCell(2).getStringCellValue());






        sht1.getRow(1).createCell(2).setCellValue("failed");
        sht1.getRow(2).createCell(2).setCellValue("failed");
        sht1.getRow(3).createCell(2).setCellValue("failed");
        sht1.getRow(4).createCell(2).setCellValue("failed");


        FileOutputStream fos=new FileOutputStream("C:\\ExcelData\\face.xlsx");
        wb.write(fos);
        wb.close();





    }
    }

