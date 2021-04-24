package Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class WebDriverManagement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
       org.openqa.selenium.WebDriver driver= new ChromeDriver();
        driver.get("http://www.seleniumhq.org");

        //WebDriverManager.firefox().setup();
       // WebDriver driver=new FirefoxDriver();



}}
