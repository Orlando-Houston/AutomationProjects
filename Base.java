package CompleteSelPro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
public static WebDriver driver;
public static Properties prop;

    public static WebDriver getDriver() throws IOException {

        prop=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\aozde\\IdeaProjects\\MyFinalProject\\src\\test\\java\\CompleteSelPro\\Global.properties" );
        prop.load(fis);

        //System.setProperty("webdriver.chrome.driver",
        //System.getProperty("user.dir")+"/Chrome/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(prop.getProperty("url"));
        return driver;
    }
}



