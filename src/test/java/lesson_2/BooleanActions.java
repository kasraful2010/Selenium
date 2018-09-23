package lesson_2;

import lesson_1.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BooleanActions extends DriverWrapper {

    @Test
    public void isElementExample() {
        boolean maleRadioButton = getDriver().findElement(By.id("u_0_i")).isSelected();
        System.out.println("Male button is : " + maleRadioButton);

        boolean signUpButton = getDriver().findElement(By.id("submit")).isDisplayed();
        System.out.println("submit button is displayed: " + signUpButton);

        boolean signUpButton2 = getDriver().findElement(By.id("u_0_f")).isEnabled();
        System.out.println("Signup button is enabled: " + signUpButton2);
    }

    @Test
    public void verifyGenderScenario() {
        // Get Gender locator
        WebElement maleRadioButton = getDriver().findElement(By.id("u_0_a"));

        if (!maleRadioButton.isSelected()) {
            maleRadioButton.click();
        } else {
            System.out.println("Male button is selected by default");
        }
    }
}
