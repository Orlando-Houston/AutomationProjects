package SaturdayOctober26TestListener;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PrepareDataAndRun {
    public void search(String url,String items) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Thread.sleep(1000);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(items);//same
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);//same
        driver.close();
    }
    }

