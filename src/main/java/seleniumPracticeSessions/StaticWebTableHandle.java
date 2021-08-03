package seleniumPracticeSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int columnCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println(rowCount + "  " + columnCount);
		
		for(int i=2; i<=rowCount; i++) {

			for(int j=1; j<=columnCount ;j++) {
				String xpath = "//table[@id='customers']//tr["+i+"]/td["+j+"]";
				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.print(text+" ");
			}
			System.out.println();
		}
	}
}
