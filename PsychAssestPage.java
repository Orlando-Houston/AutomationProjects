package Page;

import Common.Base;
import Common.Driver;
import Common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

public class PsychAssestPage extends Base {

   // private String url="https://wisefull.org/";


    private By servicesLocator = By.xpath ("//li[@id='nav-menu-item-5211']/a/span/span");
    private By coachingLocator = By.cssSelector ("#sticky-nav-menu-item-5374 > a");
    private By psychologicalAssessmentTextDisplayed=By.xpath ("//*[@id='nav-menu-item-5408']/a/span/span");
    private By psychologicalLocator=By.xpath ("//*[@id='nav-menu-item-5408']/a/span/span");
    private By photoElnaraLocator=By.xpath ("//*[@id='gallery-1']/dl[1]/dt/a/img");
    private By photoMuratLocator =By.xpath("//*[@id='gallery-1']/dl[6]/dt/a/img");
    private By internationalServiceLocator=By.cssSelector ("#media_image-3 > a > img");


    public void goToHomePage() throws Exception {
        //Driver.getDriver ().get (url);
        seleniumUtil.goToPage ("mainUrl");
        seleniumUtil.maximizingWindow ();
    }
    public void hoverOverService( ) throws Exception {

        seleniumUtil.moveToElement (servicesLocator);
        seleniumUtil.maximizingWindow ();
        seleniumUtil.getThread (2000);
    }

    public void actionMouse() throws Exception {
        seleniumUtil.moveToElement (psychologicalLocator);
        seleniumUtil.getThread (2000);
        seleniumUtil.maximizingWindow ();
        seleniumUtil.getThread (2000);
        seleniumUtil.click (psychologicalLocator);
        seleniumUtil.getThread (2000);
    }

    public void clickPhoto() throws Exception {
        seleniumUtil.click (photoElnaraLocator);
        seleniumUtil.maximizingWindow ();
        seleniumUtil.getThread (4000);
        seleniumUtil.navigateWebPage ("pagePsychologicalAssessmentsUrl");
        seleniumUtil.getThread (3000);

        seleniumUtil.click (photoMuratLocator);
        seleniumUtil.maximizingWindow ();
        seleniumUtil.getThread (4000);
      seleniumUtil.click (internationalServiceLocator);
      seleniumUtil.maximizingWindow ();
      Thread.sleep (4000);
    }

    public void verificationUrl() throws Exception {
        seleniumUtil.verifyUrl ();
        seleniumUtil.getThread (2000);

    }
        public void clickCoaching () throws Exception {
            seleniumUtil.moveToElement (coachingLocator);
            seleniumUtil.maximizingWindow ();
            seleniumUtil.getThread (2000);
            seleniumUtil.click (coachingLocator);
    }
    public void getPsychologicalAssessmentTestsProgramText(){
        String psychologicalProgramText=seleniumUtil.findElement
                (psychologicalAssessmentTextDisplayed)
                .getText ();
    }


public void assertionColorChanging(String expected) {
        expected = "rgba(66, 73, 91, 1)";
        seleniumUtil.assertionWithCssValue (servicesLocator,"color");
    }}




