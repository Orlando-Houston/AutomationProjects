package DashboardTest;

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
    @Test
    public void verifyDeleteRowFunctionality() throws InterruptedException {
        new LoginPageC ().login ("Tester","test");
        DashboardPage dashboardPage=new DashboardPage ();
        int initialNumberOfRows=dashboardPage.getNumberOfRowsOnTable ();
        // dashboardPage.checkFirstCheckBox ();
      //  dashboardPage.clickDeleteButton ();  or
        dashboardPage.deleteFirstRowTable (); //single method
        int finalNumberOfRows=dashboardPage.getNumberOfRowsOnTable ();
        Thread.sleep (2000);
        Assert.assertEquals (finalNumberOfRows,initialNumberOfRows-1);
        System.out.println ("Initial number of rows");
        System.out.println ("Final number of rows");
    }
}
