package Page;

import Common.Driver;
import Common.PageBase;
import org.openqa.selenium.By;

public  class LoginPageC extends PageBase {

    private String pageUrl="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx";
    private By userNameLocator=By.id ("ctl00_MainContent_username");//modified
    private  By passwordLocator=By.id ("ctl00_MainContent_password");//modified
    private  By loginButtonLocator=By.id ("ctl00_MainContent_login_button");//modified
    private  By statusTextLocator=By.id ("ctl00_MainContent_status");//modified

    public void goToPage(){
        Driver.getDriver ().get (pageUrl);
    }
    public void enterUserName(String userName){
        // Driver.getDriver ().findElement (userNameLocator).sendKeys (userName);
        seleniumUtil.sendKeys (userNameLocator,userName);//Base de tanimlandi
    }
    public void enterPassword(String userPassword){
        // Driver.getDriver ().findElement  (passwordLocator).sendKeys (userPassword);
        seleniumUtil.sendKeys(passwordLocator,userPassword);
    }
    public void clickLoginButton(){
        // Driver.getDriver ().findElement (loginButtonLocator).click ();
        seleniumUtil.click(loginButtonLocator);
    }
    public  String getErrorMessageText(){
        // return Driver.getDriver ().findElement (statusTextLocator).getText ();
        return seleniumUtil.getText (statusTextLocator);
    }
    public void login(String userName,String password){//new add
        goToPage ();
        enterUserName (userName);
        enterPassword (password);
        clickLoginButton ();
    }
    public boolean isLoginButtonDisplayed(){
        //return Driver.getDriver ().findElement (loginButtonLocator).isDisplayed ();//burasi dashboard testi ile beraber
        // yazildi   2hours14'
        return seleniumUtil.isDisplayed (loginButtonLocator);
    }
    @Override
    public void waitForPagTtoLoad() {

    }
}



