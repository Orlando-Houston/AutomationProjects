package Bank1;

import org.testng.annotations.Test;

public class Payment {
    @Test
    void payment1(){
        System.out.println("p1");
    }
    @Test
    void payment2(){
        System.out.println("p2");
    }
    @Test(groups = {"smoke test"})
    void payment3(){
        System.out.println(" smoke test p3");
    }
}
