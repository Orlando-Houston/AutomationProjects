package LoginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void verifyUserLoginWithCorrectCredentials(){
        WebDriverManager.chromedriver ().setup ();
        WebDriver driver=new ChromeDriver ();
        driver.get ("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.findElement (By.id ("ctl00_MainContent_username")).sendKeys ("Tester");
        driver.findElement (By.id ("ctl00_MainContent_password")).sendKeys ("test");
        driver.findElement (By.id ("ctl00_MainContent_login_button")).click ();
        Assert.assertEquals ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx",
                driver.getCurrentUrl ());

    }
    @Test
    public void verifyUserLoginWithInCorrectPasswordIsErrorMessage(){
        WebDriverManager.chromedriver ().setup ();
        WebDriver driver=new ChromeDriver ();
        driver.get ("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.findElement (By.id ("ctl00_MainContent_username")).sendKeys ("Tester");
        driver.findElement (By.id ("ctl00_MainContent_password")).sendKeys ("asdfg");
        driver.findElement (By.id ("ctl00_MainContent_login_button")).click ();
        //String errorMessageText=driver.findElement (By.id ("ctl00_MainContent_status")).getText ();
       // Assert.assertEquals (errorMessageText,"invalid login or password");
        Assert.assertEquals ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx",
                driver.getCurrentUrl ());




    }


}
