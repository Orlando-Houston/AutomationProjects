package AfterBeforeSabAlt;

import org.testng.annotations.*;

public class AllAnnotations {
    @Test

    void truck(){
        System.out.println("normal truck");
    }
    @Test
    @BeforeSuite

    void car(){
        System.out.println("This is  before suit car");
    }
    @Test
    @BeforeClass
    void byscl(){
        System.out.println("Before class bsycl");

    }
    @BeforeTest
    @Test
    void train(){
        System.out.println("Before test  train");
    }
    @AfterClass
    @Test
    void bus(){
        System.out.println("After class bus");
    }
    @Test
    void airplane(){
        System.out.println();
    }
    @AfterMethod
    @Test
    void ship(){
        System.out.println("After method ship");

    }
    @BeforeMethod
    @Test
    void helicopter(){
        System.out.println( "Before method helicopter");
    }


    @AfterSuite
    @Test
    void  yacht(){
        System.out.println("After suit yacht");


    }
    @Test

    void spacecraft (){
        System.out.println("Normal spacecraft");
    }
}
