package ParallelTest;

import org.testng.annotations.*;

public class TestNGAnnonationsTest {
    @Test
    public void TestCase1(){

        System.out.println("This is test case1");
    }
    @Test
    public void TestCase2(){
        System.out.println("This is test case2");


}
     @BeforeMethod
    public void TestCase3() {
        System.out.println("Before every method");
    }
    @AfterMethod
    public void TestCase4() {
        System.out.println("After every method");
    }@BeforeClass
    public void TestCase5() {
        System.out.println("Before every class");
    }
    @AfterClass
    public void TestCase6() {
        System.out.println("After every class");
    }
    @BeforeSuite
    public void TestCase7() {
        System.out.println("Before every suite");
    }

}