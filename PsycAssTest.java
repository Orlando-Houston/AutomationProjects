package Tests;

import Common.TestBase;
import Page.PsychAssestPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class PsycAssTest extends TestBase {
    PsychAssestPage psychPage= new PsychAssestPage ();
   @Test
    public void enterPsyPage() throws Exception {


        psychPage.goToHomePage ();


        psychPage.hoverOverService ();

        Thread.sleep (1000);
       psychPage.assertionColorChanging ("rgba(5,208,199,1)");
       Thread.sleep (1000);
       psychPage.actionMouse ();
        Thread.sleep (1000);
        psychPage.getPsychologicalAssessmentTestsProgramText ();

        Thread.sleep (1000);
       psychPage.clickPhoto ();
        Thread.sleep (1000);
       psychPage.verificationUrl ();




    }




}
