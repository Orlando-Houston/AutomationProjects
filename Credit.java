package October20SondayAfterBefore;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Credit {

    @Test

    public void application(){
        System.out.println("Application submit");
    }

    @Test

    public void  approval(){
        System.out.println("Application approved");
    }
    @BeforeTest
    public void creditCheck(){
        System.out.println("credit checked");
    }
}
