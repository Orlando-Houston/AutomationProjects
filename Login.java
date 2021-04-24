package SmokeTestSundayO20;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;

public class Login {

 @BeforeGroups

    public void login(){

        System.out.println("Logged in");
    }


    @AfterSuite
    public void  logout() {
        System.out.println("Logged out");
    }
}


