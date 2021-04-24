package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Headless {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aozde\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless","start-maximazed","--ignore-certificate-errors");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("1");
        driver.findElement(By.id("email")).sendKeys("headless");
        System.out.println("done");

    }
}
