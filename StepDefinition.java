package StepDefinition;

import Common.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class StepDefinition  {


    public WebDriver driver;


    @Given("^User will navigate to the website$")
    public void user_will_navigate_to_the_website() throws Throwable {
        WebDriverManager.chromedriver ().setup ();
       driver=new ChromeDriver ();

       driver.get ("http://secure.smartbearsoftware.com/samples/testComplete11/WebOrders/Login.aspx ");
    }

    @When("^User will enter valid username and valid password$")
    public void user_will_enter_valid_username_and_valid_password() throws Throwable {

     driver.findElement (By.id ("ctl00_MainContent_username")).sendKeys ("Tester");
     Thread.sleep (1000);
        driver.findElement (By.id ("ctl00_MainContent_password")).sendKeys ("test");
        Thread.sleep (1000);
    }

    @Then("^User will click login$")
    public void user_will_click_login() throws Throwable {
        driver.findElement (By.id ("ctl00_MainContent_login_button")).click ();

    }

    @Then("^User should be able to login successfully$")
    public void user_should_be_able_to_login_successfully() throws Throwable {
        Assert.assertEquals (driver.getCurrentUrl (),"http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");

     driver.close ();
    }
    @When("^User will enter valid username and invalid password$")
    public void user_will_enter_valid_username_and_invalid_password() throws Throwable {
        driver.findElement (By.id ("ctl00_MainContent_username")).sendKeys ("Tester");
        Thread.sleep (1000);
        driver.findElement (By.id ("ctl00_MainContent_password")).sendKeys ("asdfgh");
        Thread.sleep (1000);

    }

    @Then("^User  click login$")
    public void user_click_login() throws Throwable {
        driver.findElement (By.id ("ctl00_MainContent_login_button")).click ();

    }

    @Then("^User should be able to login unsuccessfully$")
    public void user_should_be_able_to_login_unsuccessfully() throws Throwable {
        //Assert.assertTrue (driver.findElement (By.xpath ("//*[@id='ctl00_MainContent_status']")).isDisplayed ());
         String errorMessageText=driver.findElement (By.xpath ("//*[@id='ctl00_MainContent_status']")).getText ();
        Assert.assertEquals (errorMessageText,"invalid login or password");

    }



}
