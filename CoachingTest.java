package Tests;

import Common.Base;
import Page.CoachingPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class CoachingTest extends Base {
    CoachingPage coachPag= new CoachingPage ();
@Test
public void  visitedCoachPage() throws Exception {
    coachPag.goToCoachingPage ();
    coachPag.maxWind ();
    Thread.sleep (7000);
    coachPag.clickGroupCoaching ();
    Thread.sleep (2000);
  coachPag.navigate ();

   Thread.sleep (7000);
    coachPag.moveToBusinessCoaching ();
   Thread.sleep (4000);
    coachPag.clickToBuyCourse ();
  Thread.sleep (4000);
  coachPag.clickViewCard ();
   Thread.sleep (4000);
     coachPag.removeCard ();


}

}
