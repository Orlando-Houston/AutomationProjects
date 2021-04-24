package Common;

import org.testng.annotations.*;

@Test
public abstract class TestBase extends Base {
    @BeforeSuite
    public void beforeSuit()
    {
        Driver.setUpDriver ();
    }
    @BeforeClass
    public void beforeClass(){

    }

    @BeforeMethod
    public void beforeMethod(){
        Driver.getDriver ();

    }

    public void afterMethod(){
        Driver.closeDriver ();

    }
    @AfterClass
    public void afterClass(){

    }

    @AfterSuite
    public void afterSuit(){

    }
}
