package seleniumPracticeSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	public static void main(String[] args) {
		WebDriver driver = null;
		String browser = "chrome";
		
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
	}
}
