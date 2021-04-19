package PageObjects;

import NauWebProject.Base;
import NauWebProject.Driver;
import NauWebProject.SeleniumUtil;
import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main extends Base {


    private String color="";
    private By galleryL=By.xpath ("//rs-sbg[contains(@src,'http')]");

    private By requestL=By.xpath("//span[text()='Request Info']/..");
    private By applyL=By.xpath ("//span[text()='Apply Now']/..");
    private By portalL=By.xpath ("//span[text()='365 Portal']/..");
    private By logoL=By.cssSelector ("img[alt='North American University Logo']");
    private By searchL=By.cssSelector (".ubermenu-search-input");
    private By submitL=By.cssSelector ("input[type='submit']");
    private By portalSignIn=By.cssSelector ("input[type='email']");
    private By portalPass=By.cssSelector ("input[type='password']");
    private By portalSubmit=By.cssSelector ("input[type='submit']");
    private By portalSubmit2=By.cssSelector ("input[type='idBtn_Back']");
    private By admissionsL=By.xpath ("//span[text()='Admissions']");
    private By academicsL=By.xpath ("//span[text()='Academics']");
    private By facultyL=By.xpath ("//span[text()='Faculty&Staff']");
    private By campusL=By.xpath ("//span[text()='Campus Life']");
    private By aboutNauL=By.xpath ("//span[text()='About NAU']");
    private By studentsL=By.xpath ("//span[text()='Students']");
    private By portalYesButtonL=By.cssSelector ("input[type='submit']");






    public void clickOn(String locator){
        switch(locator){
            case"request":seleniumUtil.click (requestL);break;
            case "apply":seleniumUtil.click (applyL);break;
            case "portal":seleniumUtil.click (portalL);break;
            case "logo":seleniumUtil.click (logoL);break;
            case "submit":seleniumUtil.click (submitL);break;
            case"yesButton":seleniumUtil.click (portalYesButtonL);break;
            default:break;
        }
    }
    public void signInPortal(DataTable arg ) throws IOException, InterruptedException {
        Set<String>page= Driver.getDriver ().getWindowHandles ();
        Iterator<String>myWindows=page.iterator ();
        String main=myWindows.next ();
        String portal=myWindows.next ();
        Driver.getDriver ().switchTo ().window (portal);

        List<List<String>> input=arg.raw ();
        seleniumUtil.sendKeys (portalSignIn,Driver.getProp (input.get (0).get (0)));
        seleniumUtil.enter (portalSignIn);
        seleniumUtil.getThread (1000);
        seleniumUtil.click (portalSubmit);
        seleniumUtil.getThread (1000);
        seleniumUtil.sendKeys (portalPass,Driver.getProp (input.get (0).get (1)));
        seleniumUtil.enter (portalPass);
        seleniumUtil.getThread (2000);
        seleniumUtil.click (portalSubmit2);

    }
    public void submenusIsDiaplayed(String menu){
        List<By>menuL=null;
        switch (menu){
           // case "Admissions":menuL=admissionsList;break
        }


    }
    public void mouseOver(String locator)throws InterruptedException{
        color=getElement(locator).getCssValue("color");

        seleniumUtil.getActions ().moveToElement (getElement(locator)).build ().perform ();
        Thread.sleep (1000);

    }
    private WebElement getElement(String locator){
        WebElement element=null;
        switch (locator){
            case"request":element=seleniumUtil.findElement (requestL);
            break;
            case"apply":element=seleniumUtil.findElement (applyL);
                break;
            case"portal":element=seleniumUtil.findElement (portalL);
                break;
            case"logo":element=seleniumUtil.findElement (logoL);
                break;
            case"Admissions":element=seleniumUtil.findElement (admissionsL);
                break;
            case"Academics":element=seleniumUtil.findElement (academicsL);
                break;
            case"Faculty&Staff":element=seleniumUtil.findElement (facultyL);
                break;
            case"Campus Life":element=seleniumUtil.findElement (campusL);
                break;
            case"Students":element=seleniumUtil.findElement (studentsL);
                break;
            case"AboutNAU":element=seleniumUtil.findElement (aboutNauL);
                break;
            case"gallery":element=seleniumUtil.findElement (galleryL);
                break;
        }
        return element;
    }
    public  void verifyColor(String locator){
        Assert.assertNotEquals (color,getElement (locator).getCssValue("color"));
    }

    public void verifyLink(String locator){
        WebElement element=getElement (locator);
        Assert.assertTrue (seleniumUtil.isClickable (element));
    }




}
