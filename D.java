package ParallelTest;

import org.testng.annotations.*;

public class D {
    @BeforeSuite
    public  void  d1(){
        System.out.println ("D1");
    }
    @AfterSuite
    public  void  a2(){
        System.out.println ("D2");
    }
    @Test
    public  void  D3(){
        System.out.println ("c3");
    }
    @Test
    public  void  D4(){
        System.out.println ("c4");
    }


}

