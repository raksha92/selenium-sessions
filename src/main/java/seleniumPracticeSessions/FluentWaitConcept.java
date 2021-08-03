package seleniumPracticeSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://crmpro.com/index.html");
		By locator = By.name("username");
		WebElement ele = waitForElementPresentWithFluentWait(locator, 10, 200);
		ele.sendKeys("Raksha");
	}
	
	public static WebElement waitForElementPresentWithFluentWait(By locator, int timeOut, long pollingInterval) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(timeOut))
										.pollingEvery(Duration.ofMillis(pollingInterval))
											.ignoring(NoSuchElementException.class);
		
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return ele;
	}	
}
