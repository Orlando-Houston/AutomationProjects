package Page;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PasswordPage extends Base {

    // private String pageUrl=" http://qatest2119.na.edu/";
    // private By userPasswordLocator=By.id ("i0118");
    //private By userNameClickLocator=By.id ("idSIButton9");


    public By sendPass=By.id ("i0118");
    public WebElement getSendPassword(){
        return driver.findElement (sendPass);

    }


    public By clickPass=By.id ("idSIButton9");
    public WebElement getClickPassw(){
        return driver.findElement (clickPass);

    }
}
