package lesson_2;

import lesson_1.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class LocatorTutorials extends DriverWrapper {

//    @Test
//	public void findElementUsingId() {
//		getDriver().findElement(By.id("email")).sendKeys("mohammad@technosoft.com");
//		getDriver().findElement(By.id("pass")).sendKeys("test1234");
//		getDriver().findElement(By.id("loginbutton")).click();
//	}


//    @Test
//    public void findElementByName() {
//        getDriver().findElement(By.name("email")).sendKeys("mohammad@gmail.com");
//        getDriver().findElement(By.name("pass")).sendKeys("Test1234");
//        getDriver().findElement(By.id("loginbutton")).click();
//    }

//	@Test
//	public void findElementByTagName() {
//		getDriver().findElement(By.tagName("input")).sendKeys("mohammad@gmail.com");
//	}

//	@Test
//	public void findElementByLinkText() throws InterruptedException {
//		getDriver().findElement(By.linkText("Forgot account?")).click();
//	}
//
//	@Test
//	public void findElementByPartilaLinkText() {
//		getDriver().findElement(By.partialLinkText("Forgot")).click();
//	}
//
//	@Test
//	public void findElementByXpath() throws InterruptedException {
//		getDriver().findElement(By.xpath("//*[@id='email']")).sendKeys("mohammad@gmail.com");
//		getDriver().findElement(By.xpath("//*[@id='pass']")).sendKeys("Test1234");
//		getDriver().findElement(By.xpath("//*[@id='loginbutton']")).click();
//		Thread.sleep(3000);
//	}
//
//	@Test
//	public void findElementByCSS() {
//		getDriver().findElement(By.cssSelector("#email")).sendKeys("test@test.com");
//		getDriver().findElement(By.cssSelector("#pass")).sendKeys("Test");
//		getDriver().findElement(By.cssSelector("#loginbutton")).click();
//	}
//

//	@Test
//	public void findElementByList() throws InterruptedException {
//		List<WebElement> listOfLinks = getDriver().findElements(By.tagName("a"));
//		for(WebElement element : listOfLinks) {
//			if (element.getText().equals("Forgot account?")) {
//				element.click();
//				break;
//			}
//		}
//	}

//	@Test
//	public void getDefaultFirstName() {
//		WebElement firstNameTextField = getDriver().findElement(By.id("u_0_9"));
//		System.out.println("First Name default value: " + firstNameTextField.getAttribute("aria-label"));
//	}

    @Test
    public void findInputListELement() {
        List<WebElement> listOfInputs = getDriver().findElements(By.tagName("input"));
        WebElement emailField = listOfInputs.get(1);
        emailField.sendKeys("Test");
    }
}
