package Page;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UsernamePage extends Base {

    // private String pageUrl=" http://qatest2119.na.edu/";
    // private By userNameLocator=By.cssSelector ("input[#='i0116']");
    //private By userNameClickLocator=By.cssSelector ("input#idSIButton9[type='submit']");

    public By send=By.cssSelector ("input[#='i0116']");
    public WebElement getSendUsername(){
        return driver.findElement (send);

    }


    public By click=By.cssSelector ("input#idSIButton9[type='submit']");
    public WebElement getClickNext(){
        return driver.findElement (click);

    }
}
