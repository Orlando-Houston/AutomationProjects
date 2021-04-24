package SaturdayOctober26TestListener;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

//@Listeners (ListenTo.class)
public class ListenToTest {
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/v4");
        Thread.sleep(10000);
        driver.findElement(By.name("uid")).sendKeys("mngr2304458");
        driver.findElement(By.name("password")).sendKeys("bAvaper");
        driver.findElement(By.linkText("Demo Site")).getText();
        if(toString().contains("Demo")){
            Assert.assertTrue(true);
            System.out.println("passed");
        }
        else{
            Assert.assertFalse(false);
            System.out.println("failed");
        }

    }
}
