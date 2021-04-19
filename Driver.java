package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Driver   {

    public static WebDriver driver;


    public static WebDriver getDriver() {

        if (driver == null) {
            setUpDriver ();
        }
        return driver;
    }


    public static void setUpDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver ().setup ();
            driver = new ChromeDriver ();
        }
    }

    public static void closeDriver() {
        if (driver==null){
            driver.close ();
            driver=null;
        }
    }
        public static String getProp(String url) throws IOException {
            Properties prop=new Properties ();
            FileInputStream fis=new FileInputStream ("src\\main\\java\\Common\\Global.properties");
            prop.load (fis);
            return prop.getProperty (url);
    }


}
