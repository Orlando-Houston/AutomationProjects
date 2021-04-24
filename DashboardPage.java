package Page;

import Common.Driver;
import Common.PageBase;
import org.openqa.selenium.By;

public class DashboardPage extends PageBase {
    private By userNameLocator=By.cssSelector (".login_info");
    private By logoutLinkLocator=By.linkText ("Logout");

    //private WebElement userNameElement= Driver.getDriver ().findElement (By.cssSelector (".login_info"));


    public String getUserNameFromDashboard(){

        // String text=userNameElement.getText ();
        String text= Driver.getDriver ().findElement (userNameLocator).getText ();
        return text;

    }
    public void logout(){
        Driver.getDriver ().findElement (logoutLinkLocator).click ();
    }
}
