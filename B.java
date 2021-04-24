package ParallelTest;

import org.testng.annotations.*;

public class B {
        @BeforeClass
        public  void  b1(){
            System.out.println ("B1");
        }
        @AfterClass
        public  void  b2(){
            System.out.println ("B2");
        }
        @Test
        public  void  b3(){
            System.out.println ("B3");
        }
        @Test
        public  void  b4(){
            System.out.println ("B4");
        }

}


