package Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class GoogleFactory {
String url;
String item;

        public   GoogleFactory(String Url,String item) throws InterruptedException {
            this.url=url;
            this.item=item;

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            Thread.sleep(1000);
            driver.get(url);
            // driver.manage().timeouts().implicitlyWait()
            WebDriverWait wait=new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']")));
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[type='text']")).sendKeys(item);//same
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);//same
        }



            }








