import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public WebDriver chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aozde\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;
    }
}
