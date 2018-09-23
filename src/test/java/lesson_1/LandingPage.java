package lesson_1;

import org.openqa.selenium.By;
import org.testng.Assert;

import javax.print.DocFlavor;

public class LandingPage extends BasePage{

    //Locators
    private By emailTextField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("u_0_2");
    private By maleGender = By.id("u_0_a");
    private By lastName = By.name("lastname");
    private By firstName = By.name("firstname");
    private By phoneNumber = By.xpath("//input[@id='u_0_h']");
    private By PhoneNErrorMsg = By.xpath("//div[@class='uiContextualLayerPositioner _572t uiLayer']//div[@class='uiContextualLayer uiContextualLayerLeft']");
    private By signUpButton = By.xpath("//button[@id='u_0_u']");


    //Methods
    public void enterEmail(String email) {
        setValue(emailTextField, email);
    }

    public void enterPassword(String password) {
        setValue(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOn(loginButton);
    }

    public boolean isMaleSelected() {
        return isSelected(maleGender);
    }

    public void clickOnMaleRadioButton() {
        clickOn(maleGender);
    }

    public void enterFirstName(String fname){setValue(firstName,fname); }

    public void enterLastname (String lname){setValue(lastName,lname); }

    public  void enterPnumber(String number){setValue(phoneNumber,number); }

    public void clickOnPhoneField(){clickOn(phoneNumber); }

    public  void clickOnSignButton(){clickOn(signUpButton); }

    public void pErroeMsg(String expectedErroeMsg){

        Assert.assertEquals(getTextFromElement(PhoneNErrorMsg), expectedErroeMsg); }







}
