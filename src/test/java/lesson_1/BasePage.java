package lesson_1;

import org.openqa.selenium.By;

public class BasePage {

    public void clickOn(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

    public void setValue(By locator, String text) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(text);
    }

    public String getTextFromElement(By locator) {
        return DriverWrapper.getDriver().findElement(locator).getText();
    }

    public boolean isSelected(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isSelected();
    }

    public void waitFor(int seconds ) throws InterruptedException { Thread.sleep(seconds); }

}
