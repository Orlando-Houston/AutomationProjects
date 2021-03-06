package StepDef;


import CompleteSelPro.Base;
import PageObjects.CardResults;
import PageObjects.CheckOutPage;
import PageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class StepDef {
    HomePage h=new HomePage ();
    CheckOutPage cp=new CheckOutPage ();
    CardResults cr=new CardResults ();

    @Given("^User  will navigate to the Website$")
    public void user_will_navigate_to_the_Website() throws Throwable {
        Base.getDriver ();

    }

    @When("^User searches for \"([^\"]*)\"$")
    public void user_searches_for(String arg1) throws Throwable {

    h.getSearch ().sendKeys (arg1);
    Thread.sleep (3000);

    }

    @Then("^\"([^\"]*)\" result is displayed$")
    public void result_is_displayed(String arg1) throws Throwable {
        Assert.assertTrue (h.getProductName ().getText ().contains (arg1));

    }
    @When("^User searched for \"([^\"]*)\" Vegetable$")
    public void user_searched_for_Vegetable(String arg1) throws Throwable {
        h=new HomePage ();
        h.getSearch ().sendKeys (arg1);


    }

    @When("^Added items to the cart$")
    public void added_items_to_the_cart() throws Throwable {
        HomePage h= PageFactory.initElements (Base.driver,HomePage.class);
        h.increment ();
        h.addToCart ();



    }

    @When("^User proceed to the checkOut Page$")
    public void user_proceed_to_the_checkOut_Page() throws Throwable {
        cp.getImage ().click ();
        cp.getProceedTocheckout ().click ();


    }

    @Then("^Verify selected \"([^\"]*)\" items are displayed in the Checkout Page$")
    public void verify_selected_items_are_displayed_in_the_Checkout_Page(String arg1) throws Throwable {
       // Assert.assertTrue (cr.getProduct ().getText ().contains (arg1));
        System.out.println (arg1);

    }
    @When("^User added more than one item to the cart$")
    public void user_added_more_than_one_item_to_the_cart() throws Throwable {
        String[] itemsNeeded = {"Brocoli-1kg", "Cucumber-1kg", "Beans-1kg"};
        Thread.sleep (3000);
        List<WebElement> products = h.getSelects ();
        for (int i = 0; i <= products.size (); i++) {
            String[] name = products.get (i).getText ().split ("_");
            String formattedName = name[0].trim ();
            List itemNeededList = Arrays.asList (itemsNeeded);
            if (itemNeededList.contains (name)) {
                    h.addCartLists ().get (i).click ();

                }
            }
        }
        @Then("^Verify selected  items are displayed in the Checkout Page$")
            public void verify_selected_items_are_displayed_in_the_Checkout_Page () throws Throwable {


            }
        }

