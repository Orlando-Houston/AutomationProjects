package SeleniumUtil;
import Common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.css.CSSValue;

import java.util.ArrayList;
import java.util.Set;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Common.Driver.getDriver;

public class SeleniumUtil {
    public Actions actions;
    WebDriver driver;

    public void goToPage(String url)throws IOException{
        getDriver ().get (Driver.getProp (url));

    }

    public WebElement findElement(By locator)


    {
        return getDriver ().findElement (locator);
    }

    public void moveToElement(By locator){
        Actions myAct=new Actions (getDriver ());
        myAct.moveToElement (getDriver ().findElement (locator)).build ().perform ();
    }

    public void mouseOver(By locator)
    {
        getActions ().moveToElement ( findElement ( locator ) ).build ().perform ();
    }
    public Actions getActions()

    {
        return actions=new Actions (getDriver ());
    }

      public void assertionWithCssValue(By locator ,String color) {
        String expected = getDriver ().findElement (locator).getCssValue ("color");
        String actual = "rgba(66, 73, 91, 1)";
        Assert.assertNotEquals (actual, expected);
    }


    public void click(By locator) {
        getDriver (). findElement (locator).click ();

    }
    public  void verifyUrl(){
        String expectedUrl = "https://wisefull.org/en/all-courses/";
        String actualUrl = getDriver ().getCurrentUrl ();
        if (expectedUrl.equals (actualUrl)) {
            System.out.println ("verification Successful-the correct url is displayed on the web page");
        }
        else {
            System.out.println ("verification failed ");
        }
    }
    public void sendKeys( By locator,String text)



    {

        getDriver (). findElement (locator).sendKeys (Keys.ENTER,text);
    }
    public void getPsychologicalAssessmentTestsProgramTextIsDisplayed(){
        String expectedTitle="psychologicalAssessmentTextDisplayed";
        String actualTitle=Driver.getDriver ().getTitle ();
        if (expectedTitle.equals (actualTitle)){
            System.out.println ("verification succesfull");
        }
        else{
            System.out.println ("verification failed");
        }

    }

    public String getText(By locator)

    {

        return findElement (locator).getText ();
    }

    public void clear(By locator)


    {
       getDriver (). findElement (locator).clear ();

    }
    public void closedChildWindows(By locator){

        Set<String>allHandles=Driver.getDriver ().getWindowHandles ();
        int count =2;
        //count handles here
        System.out.println ("count of windows:"+allHandles.size ());

        //get current handle or default handle
        String currentWindowHandle=allHandles.iterator ().next ();
        allHandles.remove (allHandles.iterator ());

        //get the last Window handle
        String lastHandle=allHandles.iterator ().next ();
        System.out.println ("last window handle"+lastHandle);

        //switchTo second/Last window, because we know there are only two windows 1-parent

        Driver.getDriver ().switchTo ().window (lastHandle);
        System.out.println (Driver.getDriver ().getTitle ());
        Driver.getDriver ().findElement (locator);




        }
        public void navigateWebPage(String url)
        {
        Driver.getDriver ().navigate ().back ();
        }

    public void deleteAllCookies(String url){
        Driver.getDriver ().navigate ();
        Driver.getDriver ().manage().deleteAllCookies();
    }

    public String getCSSValue(By  element, String CSSValue){
        return getDriver ().findElement (element).getCssValue (CSSValue);

    }
    public Select getSelect(By element)


{
        return new Select(getDriver ().findElement (element));
}
public  boolean isDisplayed(By locator)



{
        return findElement (locator).isDisplayed ();
}





public WebDriverWait waitFor(){
        return new WebDriverWait (getDriver (),10);

}
public void getThread(int millisecond)throws Exception
{
        Thread.sleep (millisecond);
}
    public void gotoWebsite(String url) {
        getDriver().get(url);
    }

    public void maximizingWindow()
    {
        getDriver().manage().window().maximize();
    }

public void  getQuit()

{
       Driver.getDriver ().quit ();
}

public void getClose(){
        Driver.getDriver ().close ();
}



    public void implicitlyWait()
    {
        Driver.getDriver ().manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
    }
    public void switchTo(String s) {
        Driver.getDriver ().switchTo ().frame (s);
    }
        public void deleteCookies(){
            Driver.getDriver ().manage ().deleteAllCookies ();
        }

}






