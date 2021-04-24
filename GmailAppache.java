package Homework;

    import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.*;
import java.util.concurrent.TimeUnit;

    public class GmailAppache {
        public static void main(String[] args) throws IOException, InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("http://www.gmail.com");
            File file = new File("C:\\ExcelData\\google.xlsx");
            FileInputStream fis = new FileInputStream(file);
            Workbook wb = new HSSFWorkbook(fis);
            Sheet sh = wb.getSheet("Sheet1");
            //int totalRows = sh.getLastRowNum();
            // for (int i = 0; i < totalRows + 1; i++) {

            Row rw = sh.createRow(0);
            rw.getCell(0);
            Cell cell = rw.createCell(0);
            Cell username = rw.getCell(0);
            username.setCellValue("Username");
            Row rw1 = sh.createRow(1);
            rw1.getCell(0);
            Cell cell1 = rw1.createCell(0);
            Cell e_mail = rw1.getCell(0);
            e_mail.setCellValue("ayalim2208@gmail.com");



            rw.getCell(0);
            Cell cellA = rw.createCell(1);
            Cell password = rw.getCell(1);
            password.setCellValue("Password");
            rw1.getCell(1);
            Cell cell2 = rw1.createCell(1);
            Cell pss = rw1.getCell(1);
            pss.setCellValue("123ay19");


            rw.getCell(0);
            Cell cellB = rw.createCell(2);
            Cell to = rw.getCell(2);
            to.setCellValue("To");
            rw1.getCell(1);
            Cell cell3 = rw1.createCell(2);
            Cell to1 = rw1.getCell(2);
            to1.setCellValue("zeynephouston@gmail.com");

            rw.getCell(0);
            Cell cellC = rw.createCell(3);
            Cell subject = rw.getCell(3);
            subject.setCellValue("Subject");
            rw1.getCell(1);
            Cell cell4 = rw1.createCell(3);
            Cell message = rw1.getCell(3);
            message.setCellValue("The Java Questions");

            rw.getCell(0);
            Cell cellD = rw.createCell(4);
            Cell body = rw.getCell(4);
            body.setCellValue("Body");
            rw1.getCell(1);
            Cell cell5 = rw1.createCell(4);
            Cell bodyMessage = rw1.getCell(4);
            bodyMessage.setCellValue("Hi, I hope you are doing well");

            rw.getCell(0);
            Cell cellF = rw.createCell(5);
            Cell status = rw.getCell(5);
            status.setCellValue("Status");


            FileOutputStream fos = new FileOutputStream(file);
            wb.write(fos);
            fos.close();


            driver.findElement(By.id("identifierId")).sendKeys(e_mail.getStringCellValue(), Keys.ENTER);
            driver.findElement(By.name("password")).sendKeys(pss.getStringCellValue(), Keys.ENTER);
            driver.findElement(By.xpath("//div[@class='z0']/div")).click();
            driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys(to1.getStringCellValue(), Keys.ENTER);
            driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(message.getStringCellValue());
            driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(bodyMessage.getStringCellValue());
            driver.switchTo().defaultContent();
            driver.findElement(By.xpath("//div[@aria-label='Send \u202A(Ctrl-Enter)\u202C']")).click();




            String expected = "Message sent.";
            String actual = driver.findElement(By.xpath("//span[contains(text(),'Message sent')]")).getText();
            if (expected.equals(actual)){
                rw1.getCell(1);
                Cell cell6 = rw1.createCell(5);
                Cell result = rw1.getCell(5);
                result.setCellValue("PASSED");
                FileOutputStream fos1=new FileOutputStream(file);
                wb.write(fos1);
                fos1.close();


            }



        }
    }


