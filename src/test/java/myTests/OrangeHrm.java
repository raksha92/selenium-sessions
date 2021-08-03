package myTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHrm extends BaseClass{
	
	@Test 
	public void enterNameTest() {
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.findElement(By.name("FirstName")).sendKeys("Raksha");;
		System.out.println("This is second test");
	}
	
	@Test
	public void searchProdTest() {
		driver.findElement(By.name("LastName")).sendKeys("Thakre");
		System.out.println("This is third test");
	}
}
