package lesson_2;

import lesson_1.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownTutorial extends DriverWrapper {

    @Test
    public void selectFromDropDown() throws InterruptedException {
        WebElement monthDropDown = getDriver().findElement(By.id("month"));
        Select dropDown = new Select(monthDropDown);
        dropDown.selectByVisibleText("Jan");
        dropDown.selectByIndex(4);
        dropDown.selectByValue("4");
        Thread.sleep(15000);

        List<WebElement> allOptions = dropDown.getOptions();
        boolean isFound = false;
        for(WebElement option : allOptions){
            if(option.getText().equals("foo")) {
                System.out.println("January Was found in Dropdown ");
                isFound = true;
                break;
            }
        }
        if(isFound == false) {
            Assert.fail("Specified month was not found in dropdown");
        }
    }
}
