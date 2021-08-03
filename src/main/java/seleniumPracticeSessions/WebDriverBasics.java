package seleniumPracticeSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\WebDrivers\\chromeDriver_version88\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.getCurrentUrl();
		
		driver.quit();
		
		driver.getTitle();
	}

}
