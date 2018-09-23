package lesson_2;

import lesson_1.DriverWrapper;
import lesson_1.LandingPage;
import org.testng.annotations.Test;

public class VerifyGenderSelection extends DriverWrapper {
    @Test
    public void testGender() {
        LandingPage landingPage = new LandingPage();
        if (!landingPage.isMaleSelected()) {
            landingPage.clickOnMaleRadioButton();
        } else {
            System.out.println("Male is selected");
        }
    }
}
