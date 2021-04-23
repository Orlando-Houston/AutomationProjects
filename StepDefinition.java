package StepDefinition;

import Common.Base;
import Page.HomePage;
import Page.PasswordPage;
import Page.UsernamePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Common.Base.driver;

public class StepDefinition {

    HomePage hmp;
    UsernamePage usernamePage;
    PasswordPage psp;
    @Given("^User is  navigate the web site$")
    public void user_is_navigate_the_web_site() throws Throwable {
        Base.getDriver ();
        Thread.sleep(5000);

        //driver.quit();

    }

    @When("^User is clicking the portal$")
    public void user_is_clicking_the_portal() throws Throwable {
    // hmp.sections ().click ();
     hmp.getClickPortal ().click ();
     Thread.sleep (1000);

    }

    @Then("^Email page will displayed$")
    public void email_page_will_displayed() throws Throwable {
        System.out.println ("Email page is displayed");

    }
    @When("^User will send the username$")
    public void user_will_send_the_username() throws Throwable {
        usernamePage.getSendUsername ().sendKeys ("akeskin@na.edu");

    }

    @Then("^User click the next$")
    public void user_click_the_next() throws Throwable {
        usernamePage.getClickNext ().click ();

    }
    @When("^user sign in send password$")
    public void user_sign_in_send_password() throws Throwable {
        psp.getSendPassword ().sendKeys ("Sat54140");

    }

    @Then("^user clicking next password$")
    public void user_clicking_next_password() throws Throwable {
        psp.getClickPassw ().click ();

    }

    @Then("^user clicking to moodNAU$")
    public void user_clicking_to_moodNAU() throws Throwable {

    }

    @Then("^user see Dashboard$")
    public void user_see_Dashboard() throws Throwable {

    }




}
