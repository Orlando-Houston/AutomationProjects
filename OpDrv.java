package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OpDrv {
    public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.opera.driver","C:\\Users\\aozde\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
    OperaOptions opt=new OperaOptions();
    opt.setBinary("C:\\Users\\aozde\\AppData\\Local\\Programs\\Opera\\64.0.3417.54\\opera.exe");
        WebDriver driver=new org.openqa.selenium.opera.OperaDriver(opt);
        Thread.sleep(3000);
        driver.get("htttp://www.amazon.com");

}
}
