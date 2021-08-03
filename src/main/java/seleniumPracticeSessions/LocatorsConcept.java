package seleniumPracticeSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

//		//1. Locate the element and perform the action in a single line of code.
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");

		// 2. Create a reference variable for the webElement and then perform actions on
		// the reference variable.
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement pwd = driver.findElement(By.id("input-password"));
//		email.sendKeys("test@gmail.com");
//		pwd.sendKeys("test123");

		// 3. Create By locators and then the driver works on the By locators to locate
		// the webElement and perform actions.
//		By emailId = By.id("input-email");
//		By pwdId = By.id("input-password");
//		
//		driver.findElement(emailId).sendKeys("test@gmail.com");
//		driver.findElement(pwdId).sendKeys("test123");
//		
		// 4. By locators and webElement and then perform the actions
//		By emailId = By.id("input-email");
//		By pwdId = By.id("input-password");
//		
//		WebElement email = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(pwdId);
//		
//		email.sendKeys("test@gmail.com");
//		pwd.sendKeys("test123");

		// 5. apply generic methods
		By emailId = By.id("input-email");
		By pwdId = By.id("input-password");

//		performSendKeysOperation(emailId, "test@gmail.com");
//		performSendKeysOperation(pwdId, "test123");
		
		
		//6. generic methods with separate method for getElement
		doSendKeys(emailId, "test@gmail.com");
		doSendKeys(pwdId, "test@123");
		
	}

	// 5. generic methods
//	public static void performSendKeysOperation(By locator, String value) {
//		driver.findElement(locator).sendKeys(value);
//	}
	
	//6. generic methods
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		WebElement ele = getElement(locator);
		ele.sendKeys(value);	
	}
	
}
