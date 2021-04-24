package Util;

import Common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumUtil {
    public WebElement findElement(By locator)
    {
        return Driver.getDriver ().findElement (locator);
    }

    public void sendKeys(By locator,String text){
        clear(locator);
        findElement (locator).sendKeys (text);
    }

    public void clear(By locator){
        findElement (locator).clear ();
    }
    public void click(By locator){
        findElement (locator).click ();
    }
    public String getText(By locator){
        return findElement (locator).getText ();
    }

    // public void waitFor(long millis){
    // }

    public boolean isDisplayed(By locator) {
        return findElement (locator).isDisplayed ();
        // boolean result=findElement (locator).isDisplayed ();
        //return result;
        // }
    }
    public List<WebElement>findElements(By locator){
        return Driver.getDriver ().findElements (locator);

    }
}

