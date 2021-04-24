package Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KayakLocaterCars {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.kayak.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        System.out.println(1);
        driver.findElement(By.cssSelector("a[aria-label='Cars']")).click();//tag and attribute
        Thread.sleep(2000);
        System.out.println(2);
        driver.findElement(By.cssSelector("input[aria-label='Pick-up location']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[contains(#,'pickup-display-inner')]")).sendKeys("Istanbul",Keys.ENTER);
        Thread.sleep(2000);
    }
}
