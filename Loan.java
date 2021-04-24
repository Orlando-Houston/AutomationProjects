package Bank1;

import org.testng.annotations.Test;

public class Loan {
    @Test
    void  loan1(){
        System.out.println("loan1");
    }
    @Test
    void loan2(){
        System.out.println("loan2");
    }
    @Test(groups = {"smoke test"})
    void loan3 (){
        System.out.println(" smoke test loan3");

    }
}
