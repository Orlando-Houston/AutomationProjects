package WebOrdersPage.DashBoard;

import WebOrderCommonDrive.Common.Driver;
import WebOrderCommonDrive.Common.PageBase;
import org.openqa.selenium.By;

public class DashBoardPage extends PageBase {
    private By usernameLocator=By.cssSelector (".login_info");
    private By logoutLinkLocator=By.id ("ctl00_logout");
    private By firstCheckboxLocator=By.id ("ctl00_MainContent_orderGrid_ctl02_OrderSelector");//table row
    private By deleteButtonLocator=By.id ("ct100_MainContent_btnDelete" );//delete selected
    private By tableRowLocator=By.xpath ("//table[@id='ct100_MainContent_orderGrid']//td/..");

    public String getUserNameFromDashboard(){
        String text= Driver.getDriver ().findElement (usernameLocator).getText ();
        return text;
    }
    public void logout(){
        Driver.getDriver ().findElement (usernameLocator).click ();

    }
    public void checkFirstCheckbox(){
        seleniumUtil.click (firstCheckboxLocator);
    }
    public void clickDeleteButton(){
        seleniumUtil.click (deleteButtonLocator);

    }
    public  int getNumberOfRowsTable(){
       return seleniumUtil.findElements (tableRowLocator).size ();

    }
    public void deleteFirstRow(){
        checkFirstCheckbox ();
        clickDeleteButton ();
    }

    @Override
    public void waitForPageToLoad() {
        seleniumUtil.waitForVisibility (logoutLinkLocator);

    }
}
