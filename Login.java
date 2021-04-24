package Bank1;

import org.testng.annotations.Test;

public class Login {
    @Test
    void login1(){
        System.out.println("log1");
    }
    @Test
    void  login2(){
        System.out.println("log2");
    }
    @Test(groups = {"smoke test"})
    void log3(){
        System.out.println(" smoke test log3");
    }

}

