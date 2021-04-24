package ParallelTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CrossBrowser {
    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) {
        System.out.println ("Browser name is:" + browser);
        System.out.println ("Thread id id:"+ Thread.currentThread ().getId ());
        if (browser.equalsIgnoreCase ("chrome")) {
            WebDriverManager.chromedriver ().setup ();
             driver = new ChromeDriver ();
        } else if (browser.equalsIgnoreCase ("fireFox")) {
            WebDriverManager.firefoxdriver ();
             driver = new FirefoxDriver ();
        } else if (browser.equalsIgnoreCase ("ie")) {
            WebDriverManager.edgedriver ();
             driver = new InternetExplorerDriver ();
        }
        else {
            System.out.println ("Browser is not correct");
        }

        }
        @Test
    public void test() throws InterruptedException {
        driver.get ("http://www.edureka.co/");
        WebElement Login=driver.findElement (By.linkText ("Log in"));
        Login.click ();
        Thread.sleep (2000);
        WebElement username=driver.findElement (By.id ("si_popup_email"));
        Thread.sleep (3000);
        username.sendKeys ("omkar.hiremath@dureka.co");
        Thread.sleep (3000);
        WebElement password=driver.findElement (By.id ("si_popup_passwd"));
        password.sendKeys ("12345678");
        Thread.sleep (3000);
        WebElement next=driver.findElement (By.xpath ("//button[@class='click btn-block']"));
    }

       // @Test
        //public void test1 () throws InterruptedException {
           // driver.get ("http://www.google.com");
           // Thread.sleep (4000);


    @AfterTest
    public void tearsDown(){
        driver.close ();

    }
}




