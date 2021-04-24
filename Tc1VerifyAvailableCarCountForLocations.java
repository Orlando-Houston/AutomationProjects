package Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Tc1VerifyAvailableCarCountForLocations {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();


        File file=new File("C:\\Data\\Data Teacher.xlsx");
        FileInputStream read=new FileInputStream(file);
        XSSFWorkbook wb=new XSSFWorkbook(read);
       XSSFSheet sh=wb.getSheet("Input");
        int rowCount=sh.getLastRowNum();

        for (int i=1;i<rowCount+1;i++) {
            Row rw = sh.getRow(i);
           Cell location = rw.getCell(0);
           Cell date1 = rw.createCell(1);
            Cell date2 = rw.getCell(2);
            Cell carCounts = rw.getCell(3);
           Cell expectedCounts = rw.getCell(4);


            driver.get("http://www.kayak.com");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector("a[aria-label='Cars']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[contains(@id,'pickup-display')]/div")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@aria-label='Pick-up location']")).sendKeys(location.getStringCellValue());
           Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@aria-label='Pick-up location")).sendKeys(Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("div[id*=dateRangeInput-display-start-inner']")).click();
            driver.findElement(By.cssSelector("div[id*='pickup-date-input']")).clear();
            Thread.sleep(1000);

            String pattern="mm/dd/yyy";
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
            String fakeDate1=simpleDateFormat.format(date1.getDateCellValue());
           String fakeDate2=simpleDateFormat.format(date2.getDateCellValue());



            driver.findElement(By.cssSelector("div[id*='pickup-date-input']")).sendKeys(fakeDate1);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("div[id*='pickup-date-input']")).sendKeys(Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("div[id*='dropoff-date-input']")).clear();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("div[id*='dropoff-date-input']")).sendKeys(fakeDate2);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("div[id*='dropoff-date-input']")).sendKeys(Keys.ENTER);

            double countCars=carCounts.getNumericCellValue();
           double excelValue=expectedCounts.getNumericCellValue();
           Cell result=rw.createCell(5);
            if (countCars>excelValue){
                result.setCellValue("passed");
            }
           else{
                result.setCellValue("failed");
            }
            read.close();
           FileOutputStream fos=new FileOutputStream(file);
            wb.write(fos);
           fos.close();


             {

            }
        }
    }
}
