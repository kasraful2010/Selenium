package lesson_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoTest {

    public static void main(String[] args) {
        //set chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/Caskroom/chromedriver/2.40/chromedriver");
        //Initialize webdriver interface
        WebDriver driver = new ChromeDriver();
        //Set Url
        String url = "https://www.facebook.com/";
        //goto URL https://www.facebook.com
        driver.navigate().to(url);
        //Get Current URL
        String currentUrl = driver.getCurrentUrl();
        //Verify if URL is correct
        Assert.assertEquals(currentUrl, "yahoo.com", "Invalid URL Validation");
        //quit the selenium driver
        driver.quit();

    }
}
