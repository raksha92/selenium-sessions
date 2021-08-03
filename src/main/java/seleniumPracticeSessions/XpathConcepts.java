package seleniumPracticeSessions;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConcepts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("groupautomation");;
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		// xPath of the preceding sibling - //a[text()='David Crist']/../preceding-sibling::td/input[@type='checkbox']
		driver.findElement(By.xpath("//a[text()='David Crist']/../preceding-sibling::td/input[@type='checkbox']")).click();
		System.out.println(getAllInfo("David Crist"));
	}

	public static List<String> getAllInfo(String name) {
		List<String> xPathList = new ArrayList<String>();
		List<String> infoList = new ArrayList<String>();
		
		String companyXpath = "//a[text()='"+name+"']/../following-sibling::td/a";
		String phoneXpath = "(//a[text()='"+name+"']/../following-sibling::td/span)[1]";
		String homeXpath = "(//a[text()='"+name+"']/../following-sibling::td/span)[2]";
		String mobileXpath = "(//a[text()='"+name+"']/../following-sibling::td/span)[3]";
		String emailXpath = "(//a[text()='"+name+"']/../following-sibling::td/a)[2]";
		
		xPathList.add(companyXpath);
		xPathList.add(phoneXpath);
		xPathList.add(homeXpath);
		xPathList.add(mobileXpath);
		xPathList.add(emailXpath);
				
		for(String e : xPathList) {
			String text = driver.findElement(By.xpath(e)).getText();
			infoList.add(text);			
		}
		return infoList;
	}
}
