package LoginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest1 {

    public WebDriver getDriver(){         //getDriver  method
        WebDriverManager.chromedriver ().setup ();
        WebDriver driver=new ChromeDriver ();
        return driver;
    }
    @Test
    public void verifyUserLoginWithCorrectCredentials(){
        getDriver ().get ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx");
        //methods name
        getDriver ().findElement (By.id ("ctl00_MainContent_username")).sendKeys ("Tester");
        getDriver ().findElement (By.id ("ctl00_MainContent_password")).sendKeys ("test");
        getDriver ().findElement (By.id ("ctl00_MainContent_login_button")).click ();
        Assert.assertEquals ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx",
                getDriver ().getCurrentUrl ());
    }
    @Test
    public void verifyUserLoginWithInCorrectPasswordIsErrorMessage(){
        getDriver ().get ("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        getDriver ().findElement (By.id ("ctl00_MainContent_username")).sendKeys ("Tester");
        getDriver ().findElement (By.id ("ctl00_MainContent_password")).sendKeys ("asdfg");
        getDriver ().findElement (By.id ("ctl00_MainContent_login_button")).click ();
        //String errorMessageText=driver.findElement (By.id ("ctl00_MainContent_status")).getText ();
        // Assert.assertEquals (errorMessageText,"invalid login or password");
        Assert.assertEquals ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx",
                getDriver ().getCurrentUrl ());

    }

}
