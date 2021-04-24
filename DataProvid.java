package DataDrivingTest;

import io.github.bonigarcia.wdm.UrlFilter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvid {
    @Test(dataProvider = "DataSource")
    void test1(String Url,String item,String name) throws InterruptedException {
        System.out.println(Url+"is being searched by"+item);
        System.out.println(name);
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Thread.sleep(1000);
        driver.get(Url);
       // driver.manage().timeouts().implicitlyWait()
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']")));
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(item);//same
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);//same
    }
    @DataProvider (name="DataSource")
    public Object[][] getData(){
        return new Object[][]{
                {"http://www.google.com","shoes","nl"} ,
                {"http://www.google.com","computer","n2"},
                {"http://google.com","books","n2"}
        };

    }
}
