package ParallelTest;

import org.testng.annotations.*;

public class C {
    @BeforeTest
    public  void  a1(){
        System.out.println ("c1");
    }
    @AfterTest
    public  void  a2(){
        System.out.println ("c2");
    }
    @Test
    public  void  a3(){
        System.out.println ("c3");
    }
    @Test
    public  void  a4(){
        System.out.println ("c4");
    }


}


