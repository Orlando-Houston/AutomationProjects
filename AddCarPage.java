package Common.Page;

import Common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddCarPage {

    private By yearInput = By.id("year");
    private By makeSelect = By.id("make");
    private By modelInput = By.id("model");
    private By colorInput = By.id("color");
    private By stockInput = By.id("stock");
    private By imageInput = By.id("image");
    private By addCarButton = By.tagName("button");
    public void goToPage() {
        Driver.getDriver().get("http://dealerlot.tk/add");
    }
    public void enterYear(int year) {
        Driver.getDriver().findElement(yearInput).sendKeys(year + "");//int convert String
    }

    public void enterModel(String model) {
        Driver.getDriver().findElement(modelInput).sendKeys(model);
    }
    public void enterColor(String color) {

        Driver.getDriver().findElement(colorInput).sendKeys(color);
    }

    public void enterStock(int stock) {

        Driver.getDriver().findElement(stockInput).sendKeys(stock + "");
    }

    public void enterImage(String image) {

        Driver.getDriver().findElement(imageInput).sendKeys(image);
    }
    public void selectMake(String make) {
        WebElement selectEl = Driver.getDriver().findElement(makeSelect);
        Select makeSelect = new Select(selectEl);
        switch (make.toLowerCase ()){
            case "audi":
                makeSelect.selectByVisibleText ("Wolgswagen");
                break;
            case"BMW":
                makeSelect.selectByVisibleText ("BMW");
                break;
            case "toyota":
                makeSelect.selectByVisibleText ("Toyota");
                break;
            default:
                //throw new IllegalArgumentException("Make you requested is not existing in dropdown.")
                break;

        }

    }
    public void clickAddCarButton()
    {
        Driver.getDriver().findElement(addCarButton).click();
    }

}
