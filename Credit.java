package SmokeTestSundayO20;

import org.testng.annotations.*;

public class Credit {
    @Test(groups = {"smoke test"})
    public void application(){
        System.out.println("Application submit");
    }


    @Test(groups = "smoke test")
    public void  approval(){
        System.out.println("Application approved");
    }
    @BeforeGroups
    public void creditCheck(){
        System.out.println("credit checked");

}
@BeforeGroups(groups = {"smoke test"})
public void creditCheck1(){
    System.out.println("credit check1");
}
}



