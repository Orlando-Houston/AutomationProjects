package Page;

import Common.Base;
import Common.Driver;
import org.openqa.selenium.By;

import java.awt.dnd.DragGestureEvent;
import java.io.IOException;

public class SchoolPsychologistPage extends Base {
    private  By loginLocator= By.linkText ("Login");
    private By userNameLocator=By.xpath("//*[@id=username']");
    private By passwordLocator=By.xpath ("//input[@id='password']");
    private By loginButtonLocator=By.id ("#loginbtn");
    private By policiesLocator=By.xpath ("//*[@id=\"page-login-index\"]/div[3]/div[2]/ul/li[1]/a");

    public void goToSchoolPsychologistPage() throws Exception {
        seleniumUtil.goToPage ("pageSchoolPsyUrl");
        seleniumUtil.maximizingWindow ();
    }
    public void clickTheLogin() throws Exception {

        seleniumUtil.mouseOver (loginLocator);

        seleniumUtil.click (loginLocator);
        //seleniumUtil.getThread (2000);
        seleniumUtil.maximizingWindow ();
       // seleniumUtil.getThread (2000);
       // seleniumUtil.goToPage ("pageSchoolLoginUrl");
       // seleniumUtil.deleteAllCookies ("pageSchoolLoginUrl");
      //  seleniumUtil.getThread (3000);
      //  seleniumUtil.mouseOver (userNameLocator);
       // seleniumUtil.click (userNameLocator);
           Thread.sleep (2000);
           seleniumUtil.sendKeys (userNameLocator, "altun");
          Thread.sleep (2000);
          //  seleniumUtil.findElement (passwordLocator).click ();
         // seleniumUtil.getThread (2000);
       //   seleniumUtil.sendKeys (passwordLocator,"keskin");
        // seleniumUtil.getThread (2000);
        //  seleniumUtil.findElement (loginButtonLocator).click ();
        //  seleniumUtil.click (loginLocator);


    }
    public void goBackPage() throws Exception {
         seleniumUtil.goToPage ("mainUrl");
         seleniumUtil.getThread (2000);

    }
    public void quitePage(){
        seleniumUtil.getQuit ();
    }
}
