package AfterBeforeSabAlt;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteAnnotation {
    @AfterSuite
    @Test
    public void annotationCheck(){

        System.out.println("After suit check");
    }
    @BeforeSuite
    @Test
    public void annotationCheck1(){
        System.out.println("Before suit check");
}
@Test

public void annotationCheck2() {
        System.out.println("Normal check");
    }}