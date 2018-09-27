package lesson_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyDropDown  extends DriverWrapper{

    @Test
    public void dropDown(){
        WebElement dropdown = getDriver().findElement(By.cssSelector("#month"));
        Select monthDropdown = new Select(dropdown);
        List<WebElement> listOfMonth = monthDropdown.getOptions();
        boolean isFound = false;

        for(WebElement option : listOfMonth){
            if (option.getText().equals("Jan")){
                System.out.println("is present");
                isFound = true;
                break;
            }

        }
        if (isFound == false){
            Assert.fail("not Present");

        }
    }
}
  // end class