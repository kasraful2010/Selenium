package lesson_1;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By invalidErrorMessage = By.id("someId");

    public String getInvalidLoginErrorMessage() {
        return getTextFromElement(invalidErrorMessage);
    }
}
