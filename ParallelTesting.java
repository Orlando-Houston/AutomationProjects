package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
    @Test
    public void google()
    {
        System.out.println(Thread.currentThread().getId());
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void selenium()
    {
        System.out.println(Thread.currentThread().getId());
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.selenium.com");
        System.out.println(driver.getTitle());

    }
}
