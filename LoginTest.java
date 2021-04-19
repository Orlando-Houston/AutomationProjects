package WebOrderTests;

import WebOrderCommonDrive.Common.Driver;
import WebOrderCommonDrive.Common.TestBase;
import WebOrdersPage.Login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import WebOrdersPage.DashBoard.DashBoardPage;



public class LoginTest extends TestBase {
    @Test
    public void verifyUserCanLoginWithCorrectCredentials(){
        LoginPage loginPage=new LoginPage ();
        loginPage.login ("Tester","test");
        new DashBoardPage ().waitForPageToLoad ();
        Assert.assertEquals (Driver.getDriver().getCurrentUrl (),
               " http://secure.smartbearsoftware.com/samples/TestComplet11/WebOrders/default.aspx\n");
           }
           @Test
        public void verifyUserIncorrectPasswordIsShownErrorMessage(){
        LoginPage loginPage=new LoginPage ();
        loginPage.login ("Tester","zxcvbsdf");
        String errorMessageText=loginPage.getErrorMessageText ();
        Assert.assertEquals (errorMessageText,"Invalid Login or Password.");
    }
}