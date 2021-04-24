package ParallelTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
     @BeforeMethod
    public  void  a1(){
        System.out.println ("A1");
    }
    @AfterMethod
    public  void  a2(){
        System.out.println ("A2");
    }
    @Test
    public  void  a3(){
        System.out.println ("A3");
    }
    @Test
    public  void  a4(){
        System.out.println ("A4");
    }


}
