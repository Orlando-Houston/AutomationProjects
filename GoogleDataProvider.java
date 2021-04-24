package SaturdayOctober26TestListener;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


@Listeners(GoogleListener.class)


public class GoogleDataProvider {

    @Test(dataProvider = "DataSource")
    void test1(String Url,String item) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Thread.sleep(1000);
        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(item);//same
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);//same
    }
    @DataProvider(name="DataSource")
    public Object[][] getData(){
        return new Object[][]{
                {"http://www.google.com","shoes"} ,
                {"http://www.google.com","computer"},
                {"http://google.com","books"},
                {"http://google.com","jacket"},
                {"http://google.com","shirt"}
        };

    }
}


