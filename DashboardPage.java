package Page;

import Common.Driver;
import Common.PageBase;
import org.openqa.selenium.By;

public class DashboardPage extends PageBase {
    private By userNameLocator=By.cssSelector (".login_info");
    private By logoutLinkLocator=By.linkText ("Logout");
    private By checkFirstBoxLocator=By.id ("ctl00_MainContent_orderGrid_ctl02_OrderSelector");
    private By deleteButtonLocator=By.id ("ctl00_MainContent_btnDelete");
    private By tableRowLocator=By.xpath ("//table[@id='ctl00_MainContent_orderGrid']//td/..");

    //private WebElement userNameElement= Driver.getDriver ().findElement (By.cssSelector (".login_info"));


    public String getUserNameFromDashboard(){

        // String text=userNameElement.getText ();
        String text= Driver.getDriver ().findElement (userNameLocator).getText ();
        return text;

    }
    public void logout(){
        Driver.getDriver ().findElement (logoutLinkLocator).click ();

    }
    public void checkFirstCheckBox (){
                             //locator
        seleniumUtil.click (checkFirstBoxLocator);
    }
    public void clickDeleteButton(){
        seleniumUtil.click (deleteButtonLocator);
    }
    public int getNumberOfRowsOnTable(){
      return seleniumUtil.findElements (tableRowLocator).size ();
    }
    public void  deleteFirstRowTable(){
        checkFirstCheckBox ();
        clickDeleteButton ();
    }

    @Override
    public void waitForPagTtoLoad() {

    }
}
