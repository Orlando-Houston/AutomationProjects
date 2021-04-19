package StepDefinitionsFiles;

import NauWebProject.Base;
import NauWebProject.Driver;
import NauWebProject.SeleniumUtil;
import PageObjects.Main;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RunWith(Cucumber.class)
public class HYMain extends Base {


    private Main main=new Main ();

    private String search;




        @Given("^User navigates to \"([^\"]*)\" page$")
        public void user_navigates_to_something_page(String strArg1) throws Throwable {
            seleniumUtil.goToPage (strArg1);
            Thread.sleep (1000);
           Base.getDriver ();


        }

        @When("^User clicks on \"([^\"]*)\" button$")
        public void user_clicks_on_something_button(String strArg1) throws Throwable {
            main.clickOn (strArg1);

        }

        @Then("^User should navigate to \"([^\"]*)\" page$")
        public void user_should_navigate_to_something_page(String strArg1) throws Throwable {

            if (strArg1.equals ("search")) {

                Assert.assertTrue (seleniumUtil.getUrl ().contains (search));


                Assert.assertEquals (Driver.getProp (strArg1), seleniumUtil.getUrl ());
            }

        }
    @When("^User will sign in with following information$")
    public void user_will_sign_in_with_following_information(DataTable arg1) throws Throwable {

            main.signInPortal (arg1);

        }
    @When("^Users hover on \"([^\"]*)\" title$")
    public void users_hover_on_something_title(String menu, String strArg1) throws Throwable {
        main.mouseOver (strArg1);

    }

    @Then("^Color of \"([^\"]*)\" title should change$")
    public void color_of_something_title_should_change(String menu, String strArg1) throws Throwable {
            main.verifyColor (strArg1);

    }

    @And("^\"([^\"]*)\" title should be link$")
    public void something_title_should_be_link(String menu, String strArg1) throws Throwable {
            main.verifyLink (strArg1);

    }

}




