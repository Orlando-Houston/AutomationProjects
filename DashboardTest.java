package WebOrderTests;

import WebOrderCommonDrive.Common.TestBase;
import WebOrdersPage.DashBoard.DashBoardPage;
import WebOrdersPage.Login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DashboardTest extends TestBase {
    @Test
    public void verifyUserNameDashboardMatches(){
        new LoginPage ().login ("Tester","test");
        String userNameOnDashboard=new DashBoardPage().getUserNameFromDashboard ();
        Assert.assertTrue (userNameOnDashboard.contains("Tester"));

    }

    @Test
    public void verifyUserCanLogout(){
        LoginPage loginPage=new LoginPage ();
        loginPage.login ("Tester","test");
        new DashBoardPage ().logout ();
        boolean isLoginButtonDisplayed=new LoginPage ().isLoginButtonDisplayed ();
        Assert.assertTrue (isLoginButtonDisplayed);

    }
    @Test
    public void verifyDeleteRowFunctionality() throws InterruptedException {
        new LoginPage ().login ("Tester","tester");
        DashBoardPage dashBoardPage=new DashBoardPage ();
        int initialNumberOfRows=dashBoardPage.getNumberOfRowsTable ();
        dashBoardPage.checkFirstCheckbox ();
        dashBoardPage.clickDeleteButton ();
        int finalNumberOfRows=dashBoardPage.getNumberOfRowsTable ();
        Thread.sleep (2000);
        System.out.println ("Initial number of rows");
        System.out.println ("Final number of rows");
        Assert.assertEquals (finalNumberOfRows,initialNumberOfRows-1);
    }
}
