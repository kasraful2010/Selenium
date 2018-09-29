package lesson_1;

import org.openqa.selenium.By;

public class Hotels extends BasePage {

    private By checkIn = By.xpath("//input[@class='query-localised-check-in ']");

    public void clickOnCheckIn(){clickOn(checkIn);}



}
