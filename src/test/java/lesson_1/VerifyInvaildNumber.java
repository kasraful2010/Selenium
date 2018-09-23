package lesson_1;

import org.testng.annotations.Test;

public class VerifyInvaildNumber extends DriverWrapper {

    @Test
    public void verifyInvaildNumber() throws InterruptedException {
        LandingPage reg = new LandingPage();
        reg.enterFirstName("iiiiiii");
        reg.waitFor(10);
        reg.enterLastname("test");
        reg.waitFor(20);
        reg.enterPnumber("79879873218979874");
        reg.clickOnSignButton();
        reg.clickOnPhoneField();
        reg.waitFor(20);
        reg.pErroeMsg("Please enter a valid mobile number or email address.\n" +
                "Close popup and return");

        Thread.sleep(10);
    }

}
