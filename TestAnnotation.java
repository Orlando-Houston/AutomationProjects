package AfterBeforeSabAlt;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnnotation {
    @Test
    void testCheck(){
        System.out.println("Test Normal check");
    }
    @AfterSuite
      @Test
    void testCheck1(){
            System.out.println("After test check");
        }
@Test
@BeforeSuite
        void testCheck2(){
                System.out.println("Before test check");
            }}
