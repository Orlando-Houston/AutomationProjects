package SundayTimeOutEnable;

import org.testng.annotations.Test;

public class Credit {
    @Test(timeOut = 3000)
    public void application() throws InterruptedException {
        //Thread.sleep(4000);
        System.out.println("Application submit");
    }


    @Test(dependsOnMethods = "application")
    public void  approval(){
        System.out.println("Application approved");
    }
    @Test(enabled=false)
    public void creditCheck(){
        System.out.println("credit checked");

    }
}
