package DataDrivingTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*

public class DataDrivenFrameworkUsingExcelFile  {
    WebDriver driver;
    Workbook wb;
    Sheet sh1;
    int numrow;
    String username;
    String password;

    @BeforeTest
    public void Setup(){
        WebDriverManager.chromedriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

    }
    @Test(dataProvider = "testdata")
    public void TestChrome(String username,String password1){

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);

    }
    @DataProvider(name="testdata")
    public Object[][] TestDataFeed(){
        try{
        wb=Workbook.getWorkbook(new File("location of excel sheet/"));
        sh1=wb.getSheetAt(0);
        numrow=sh1.getRows();
    }
        catch (Exception e){
            e.printStackTrace();
        }
        Object[][] facebookdata=new Object[numrow][sh1.getColumns()];
        for (int i=0;i<numrow;i++){
            facebookdata[i][0]=sh1.getCell(0,i).getContents();
            facebookdata[i][1]=sh1.getCell(1,i).getContents();

        }
        return facebookdata;
}
@AfterTest
public void QuitTC(){
        driver.quit();
    }
}

 */

