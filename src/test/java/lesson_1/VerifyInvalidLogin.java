package lesson_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyInvalidLogin extends DriverWrapper{

    @Test
    public void verifyInvalidLogin() {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();
        //2. Enter username
        landingPage.enterEmail("mohammad@technosoft.io");
        //3. Enter password
        landingPage.enterPassword("test12345");
        //4. Click on login button
        landingPage.clickOnLoginButton();
        //5. Verify invalid login error message
        Assert.assertEquals("The email you’ve entered doesn’t match any account.",
                loginPage.getInvalidLoginErrorMessage(), "Unable to verify error message");
    }
}
