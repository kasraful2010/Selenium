package lesson_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {

    private static WebDriver driver = null;
    private static String url = "https://www.facebook.com/";

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void initializeWebDriver() {
        //set chromedriver
        System.setProperty("webdriver.chrome.driver", System. getProperty("user.dir") + "/chromedriver/2.40/chromedriver");
        //Initialize webdriver interface
        driver = new ChromeDriver();
        //1. Goto Facebook homepage
        driver.navigate().to(url);
    }

    @AfterClass
    public void tearDown() {
        //quit the selenium driver
        driver.quit();
    }

}
