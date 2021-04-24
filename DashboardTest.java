package Test;

import Common.TestBase;
import Page.DashboardPage;
import Page.LoginPageC;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTest extends TestBase {

        public  void verifyUsersNameOnDashboardMatches(){
            new LoginPageC ().login ("Tester","test");
            String usersNameOnDashboard=new DashboardPage ().getUserNameFromDashboard ();
            Assert.assertTrue (usersNameOnDashboard.contains ("Tester"));
        }
        @Test
        public void verifyUserCanLogout(){
            LoginPageC loginPageC=new LoginPageC ();
            loginPageC.login ("Tester","test");
            new DashboardPage ().logout ();
            boolean isLoginButtonDisplayed=loginPageC.isLoginButtonDisplayed ();
            Assert.assertTrue (isLoginButtonDisplayed);
        }
    }

