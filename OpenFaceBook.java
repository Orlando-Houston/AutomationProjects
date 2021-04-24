package DataDrivingTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenFaceBook {
    @Test(dataProvider = "testdata")
    public void TestChrome(String username,String password){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);

    }
    @DataProvider(name="testdata")
    public Object[][]TestDataFeed(){
        Object[][] facebookdata=new Object[2][2];
        facebookdata[0][0]="Selenium1@gmail.com";
        facebookdata[0][1]="Password1";
        facebookdata[1][0]="Selenium2@gmail.com";
        facebookdata[1][1]="Password2";
        return facebookdata;

    }
}
