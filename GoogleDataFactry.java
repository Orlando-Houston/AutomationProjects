package DataDrivingTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class GoogleDataFactry {
    String Url;
    String items;



    @Factory(dataProvider = "DataSource")
    public  GoogleDataFactry(String Url,String items){

        this.items=items;
        this.Url=Url;


    }
    @Test
    void openGoogle (String Url) throws InterruptedException {
        System.out.println(Url+"is being searched by"+items);

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Thread.sleep(1000);
        driver.get(Url);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(items);//same
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);//same
    }
    @Factory(dataProvider = "DataSource")
    public  Object[]factory(){
        return new Object[]{ new GoogleDataFactry( Url,items)};


    }
    @DataProvider(name="DataSource")
    public Object[][] getData(){
        return new Object[][]{
                {"http://www.google.com","shoes"} ,
                {"http://www.google.com","computer"},
                {"http://google.com","books"}
        };

    }
}


