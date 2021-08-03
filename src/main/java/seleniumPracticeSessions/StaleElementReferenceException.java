package seleniumPracticeSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceException {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://crmpro.com/index.html");
		By locator = By.name("username");
		WebElement username = driver.findElement(locator);
		
		username.sendKeys("Raksha");
		driver.navigate().refresh();
		
		username = driver.findElement(locator);
		username.sendKeys("Raksha");
	}
}
