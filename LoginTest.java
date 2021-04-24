package Test;

import Common.Driver;
import Common.TestBase;
import Page.LoginPageC;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    public void verifyUserLoginWithCorrectCredentials() {
        LoginPageC loginPageC=new LoginPageC ();
        loginPageC.login ("Tester","test");
        loginPageC.clickLoginButton ();
        Assert.assertEquals ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx"
                , Driver.getDriver ().getCurrentUrl ());

    }
    @Test
    public void verifyUserWithIncorrectPasswordIsShownErrorMessage(){
        LoginPageC loginPageC=new LoginPageC ();
        loginPageC.login ("Tester","asdfgh");
        loginPageC.clickLoginButton ();
        String errorMessageText=loginPageC.getErrorMessageText();
        Assert.assertEquals (errorMessageText,"invalid login or password");

    }
}
