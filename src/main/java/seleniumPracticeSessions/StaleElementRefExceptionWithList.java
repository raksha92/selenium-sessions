package seleniumPracticeSessions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionWithList {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		List <WebElement> list = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a"));

		for(WebElement e : list) {
			System.out.println(e.getText());
			e.click();
			list = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a"));
		}
	}
}
