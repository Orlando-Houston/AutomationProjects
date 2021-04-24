package Common;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class TestBase extends Base {
    @BeforeSuite
    public void beforeSuit(){

    }
    @BeforeMethod
    public void beforeMethod(){

    }
    @AfterMethod
    public void afterMethod(){

    }
    @AfterSuite
    public void afterSuit(){

    }

}
