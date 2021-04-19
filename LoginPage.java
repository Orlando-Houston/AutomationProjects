package WebOrdersPage.Login;

import WebOrderCommonDrive.Common.Driver;
import WebOrderCommonDrive.Common.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    private String pageUrl="http://secure.smartbearsoftware.com/samples/TestComplet11/WebOrders/default.aspx";
    private  By userNameLocator=By.id ("ctl00_MainContent_username");
    private By passwordLocator= By.id ("ctl00_MainContent_password");
    private By loginButtonLocater=By.id ("ct100_MainContent_status");
    private By statusTextLocator=By.xpath ("//span[@id='ct100_MainContent_status']");


    public void goToPage(){
        Driver.getDriver ().get (pageUrl);
    }

    public void enterUsername(String userName){
       seleniumUtil.sendKeys (userNameLocator,userName);
    }
    public void  enterPassword(String password){
       seleniumUtil.sendKeys (passwordLocator,password);
    }
    public void clickLoginButton() {
        seleniumUtil.click (loginButtonLocater);
    }
    public String getErrorMessageText() {
        return seleniumUtil.getText (statusTextLocator);

    }
    public void login(String username,String password){
        goToPage();
        enterUsername (username);
        enterPassword (password);
        clickLoginButton ();
    }
    public boolean isLoginButtonDisplayed(){
        return seleniumUtil.isDisplayed (loginButtonLocater);

    }

    @Override
    public void waitForPageToLoad() {

    }
}
