package October20SondayAfterBefore;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
    @BeforeSuite

    public void login(){

        System.out.println("Logged in");
    }
    @AfterSuite


    public void  logout(){
        System.out.println("Logged out");
    }
}
