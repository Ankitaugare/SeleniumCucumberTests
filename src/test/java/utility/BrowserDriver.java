package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
    public static WebDriver driver;

    //Constructor creating-when we call class automatically Constructor is called
    public BrowserDriver() {
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void close(){
        this.driver.close();
    }
}
