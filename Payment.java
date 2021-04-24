package October20SondayAfterBefore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Payment {
    @BeforeMethod
    public void data(){

        System.out.println("test data prepared");
    }
    @AfterMethod
    public void paid(){
        System.out.println("1st payment paid");
    }
    @Test
    public void invoice(){
        System.out.println("invoice sent");
    }
}
