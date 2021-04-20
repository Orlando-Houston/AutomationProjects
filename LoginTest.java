package LoginTest;

import Common.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static Common.Driver.getDriver;

public class LoginTest {

    @Test
    public void verifyUserLoginWithCorrectCredentials() throws InterruptedException {
       Driver. getDriver ().get ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx");
        //driver.manage ().window ().maximize ();
       // driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        Thread.sleep (3000);

            //methods name
        Driver. getDriver ().findElement (By.id ("ctl00_MainContent_username")).sendKeys ("Tester");
        Driver.getDriver ().findElement (By.id ("ctl00_MainContent_password")).sendKeys ("test");
       Driver. getDriver ().findElement (By.id ("ctl00_MainContent_login_button")).click ();
        Assert.assertEquals ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx",
                getDriver ().getCurrentUrl ());
    }
    @Test
    public void verifyUserLoginWithInCorrectPasswordIsErrorMessage(){
       Driver. getDriver ().get ("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

       Driver. getDriver ().findElement (By.id ("ctl00_MainContent_username")).sendKeys ("Tester");
       Driver. getDriver ().findElement (By.id ("ctl00_MainContent_password")).sendKeys ("asdfg");
        Driver.getDriver ().findElement (By.id ("ctl00_MainContent_login_button")).click ();
        //String errorMessageText=driver.findElement (By.id ("ctl00_MainContent_status")).getText ();
        // Assert.assertEquals (errorMessageText,"invalid login or password");
        Assert.assertEquals ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx",
                getDriver ().getCurrentUrl ());

    }

}
