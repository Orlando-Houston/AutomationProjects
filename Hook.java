package StepDefinitionsFiles;

import NauWebProject.Base;
import NauWebProject.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Base {

    @Before
    public void beforeTest() {
        Driver.setDriver ();
        // seleniumUtil.goToPage("main");
        Driver.getDriver ().manage ().window ().maximize ();
    }}
    /*
    @After
    public void afterTest(){
        Driver.closeDriver ();


    }}

     */

