package NauWebProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class Base {
    protected SeleniumUtil seleniumUtil = new SeleniumUtil ();

}
    /*
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {

        prop=new Properties();
        FileInputStream fis=new FileInputStream("src\\test\\java\\NauWebProject\\global.properties" );
        prop.load(fis);

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver ();
        driver.get(prop.getProperty("url"));
        return driver;
    }
}

     */


