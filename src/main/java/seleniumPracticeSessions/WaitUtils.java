package seleniumPracticeSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	WebDriver driver;
	
	public WaitUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return ele;
	}
	
	public WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return ele;
	}
	
	public WebElement waitForElementVisibleWithElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator))); //but here we have to pass WebElement in the visibilityOf() method. 
		return ele;
	}
	
	public Alert waitForAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
	
	public void acceptAlert(int timeOut) {
		Alert alert = waitForAlert(timeOut);
		alert.accept();
	}
	
	public String getTextFromAlert(int timeOut) {
		Alert alert = waitForAlert(timeOut);
		return alert.getText();
	}
	
	public String waitForTitle(int timeOut, String title, int pollingInterval) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut, pollingInterval);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	
	public String waitForTitleContains(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();	
	}
	
	public Boolean waitForUrl(int timeOut, String partialUrl) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		Boolean var = wait.until(ExpectedConditions.urlContains(partialUrl));
		return var;
	}
	
	public void waitForFrameWithLocator(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public void waitForFrameWithIDorName(int timeOut, String idOrName) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public void waitForFrameWithIndex(int timeOut, int index) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	
	public void waitForFrameWithElement(int timeOut, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}
	
	public List<WebElement> waitForPresenceOfElements(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		List<WebElement> eleList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return eleList;
	}
	
	public List<WebElement> aitForVisibilityOfAllElements(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		List<WebElement> eleList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return eleList;
	}
	
	public WebElement waitForElementClickable(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(locator));
		return ele;
	}
	
	

}
