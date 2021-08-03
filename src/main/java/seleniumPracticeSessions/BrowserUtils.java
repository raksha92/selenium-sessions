package seleniumPracticeSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {
	WebDriver driver;
	String browser = "chrome";
	
	public WebDriver initDriver(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "E:\\WebDrivers\\chromeDriver_version88\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "E:\\WebDrivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please enter proper browser name");
			break;
		}
		return driver;
	}
	
	public void launchApp(String url) {
		driver.get(url);
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
		
	public void closeBrowser() {
		driver.quit();
	}
}
