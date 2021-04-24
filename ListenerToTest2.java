package SaturdayOctober26TestListener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerToTest2 {
    @Test
    public void testToBeFail()
    {
        Assert.assertTrue(false);
    }
}

