package DataDrivingTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WordPressLogin {
    @Test(dataProvider ="wordpressData")
    public void loginToWordPress(String username,String password) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demosite.center/wordpress/wp-login.php");

        Thread.sleep(1000);
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_pass")).sendKeys("password");
        driver.findElement(By.xpath(".//*[@id='wp-submit]")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.quit();

    }      //data type
    @DataProvider(name="wordpressData")
    public Object[][] passData(){    //two dimensional array-2 column
                            //rows column
        Object[][]data=new Object[3][2];//declare
//initil
        data[0][0]="admin1";
        data[0][1]="demo1";

        data[1][0]="admin";
        data[1][1]="demo123";

        data[2][0]="admin2";
        data[2][1]="demo1234";
        return  data;


    }
}
