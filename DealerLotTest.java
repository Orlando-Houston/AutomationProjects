package DealerLotTests;

import Common.Page.AddCarPage;
import Common.Page.HomePage;
import Common.Utility.DbUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DealerLotTest {

    @Test
    public void verifyNumberOfCarsOnPageMatchNumberOfCarsInDataBase(){

        HomePage homePage=new HomePage ();
        homePage.goToPage ();
        int numberOfCarsOnPage=homePage.getNumberOfCarsOnPage ();
        // numberOfCarsOnPage=20;
        System.out.println ("There are"+numberOfCarsOnPage+"cars on Homepage");

        int numberOfCarsInDb= DbUtil.getNumberOfCarsFromDb ();
        System.out.println("There are " + numberOfCarsInDb + " cars in database");
        Assert.assertEquals(numberOfCarsInDb, numberOfCarsOnPage);
    }

    @Test
    public void verifyAddingNewCarCreatesRowForNewCarInDatabase() {
        AddCarPage  addCarPage;
        addCarPage = new AddCarPage ();
        addCarPage.goToPage();
        addCarPage.enterYear(1976);
        addCarPage.selectMake("Wolgswagen");
        addCarPage.enterModel("Beetle");
        addCarPage.enterColor("blue");
        addCarPage.enterStock(777);
        addCarPage.enterImage("https://specials-images.forbesimg.com/imageserve/5d530ca995808800097cac0b/960x0.jpg?cropX1=498&cropX2=3378&cropY1=695&cropY2=2315");
        addCarPage.clickAddCarButton();
       // boolean result = DbUtil. doesStockExistInDb (787);
       // Assert.assertTrue(result);
    }
}
