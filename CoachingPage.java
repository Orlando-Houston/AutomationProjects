package Page;

import Common.Base;
import Common.Driver;
import org.openqa.selenium.By;

import java.io.IOException;

public class CoachingPage extends Base {

    private By groupCoachingLocator = By.xpath ("//a[contains(text(),'Group Coaching')]");

    private By videoLinkLocator=By.xpath ("//*[@id='player_uid_156643726_1']/div[3]/div[2]/div/a");
    private By businessCoachingLocator=By.xpath ("//div[contains(@class,'vc_row wpb_row vc_row-fluid vc_custom_1568473353710 vc_row-has-fill')]" +
            "//a[contains(text(),'Business Coaching')]");
    private By buyCourseLocator=By.xpath("//span[@class='eltdf-btn-text']");
    private By viewCardLocator=By.xpath ("//span[@class='eltdf-btn-text']");
    private By lookAtTheCartLocator=By.xpath ("//span[@class='eltdf-cart-icon icon_bag_alt']");



    public void goToCoachingPage() throws Exception {
        seleniumUtil.goToPage ("pageCoachingUrl");
        seleniumUtil.maximizingWindow ();
        seleniumUtil.implicitlyWait ();

    }
    public void clickGroupCoaching() throws InterruptedException {
        seleniumUtil.moveToElement (groupCoachingLocator);
        seleniumUtil.implicitlyWait ();
        seleniumUtil.findElement (groupCoachingLocator);
        seleniumUtil.implicitlyWait ();
        seleniumUtil.click (groupCoachingLocator);
        seleniumUtil.maximizingWindow ();

    }


    public void goBackCoachPage(){
      //  seleniumUtil.closedChildWindows ();
        seleniumUtil.getClose ();

    }


    public void moveToBusinessCoaching(){
        seleniumUtil.mouseOver (businessCoachingLocator);
        seleniumUtil.click (businessCoachingLocator);
    }

    public void clickToBuyCourse(){
        seleniumUtil.mouseOver (buyCourseLocator);
        seleniumUtil.click (buyCourseLocator);
    }

    public void clickViewCard(){
        seleniumUtil.moveToElement (viewCardLocator);
        seleniumUtil.click (viewCardLocator);
    }
    public void removeCard(){
        seleniumUtil.mouseOver (lookAtTheCartLocator);
        seleniumUtil.click (lookAtTheCartLocator);
       // seleniumUtil.clear (lookAtTheCartLocator);

    }
    public void maxWind(){
        seleniumUtil.maximizingWindow ();
    }
    public void navigate(){
        seleniumUtil.navigateWebPage ("pageCoachingUrl");
    }



    }




