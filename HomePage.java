package Page;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;
import java.awt.*;

public class HomePage extends Base {
   // private String pageUrl=" http://qatest2119.na.edu/";
   // private By userPortalLocator=By.xpath ("//*[@id='menu-item-103']/a/span");


    public By click=By.xpath ("//*[@id='menu-item-103']/a/span");
    public WebElement getClickPortal()
    {

        return driver.findElement (click);
    }

    public Actions sections(){
        Actions act=new Actions (driver);
        act.moveToElement (driver.findElement (By.xpath ("//*[@id='menu-item-103']/a/span"))).build ().perform ();
        return act;


    }}




