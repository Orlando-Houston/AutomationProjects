package DealerLotTests;

import Common.Page.HomePage;
import Common.Utility.DbUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
}
