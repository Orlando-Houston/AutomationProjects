package DependOnSunday;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Credit {
    @Test(dependsOnMethods ={ "creditCheck"})
    public void application()
    {
        System.out.println("Application submit");
    }


    @Test(dependsOnMethods = {"application"})
    public void  approval(){
        System.out.println("Application approved");
    }
    @Test
    public void creditCheck(){
        System.out.println("credit checked");

    }
}





