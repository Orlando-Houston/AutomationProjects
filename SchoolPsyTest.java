package Tests;

import Common.Base;
import Page.SchoolPsychologistPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class SchoolPsyTest extends Base {
    SchoolPsychologistPage spp=new SchoolPsychologistPage ();
    @Test
    public void visitedSchoolPsyPageAndIncorrectLogin() throws Exception
    {
        spp.goToSchoolPsychologistPage ();
        Thread.sleep (5000);

        spp.clickTheLogin ();
        Thread.sleep (5000);




        spp.goBackPage ();
       Thread.sleep (5000);
       spp.quitePage ();


    }
}
