package myTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CrmPro extends BaseClass {
	@Test 
	public void usernameTest() {
		driver.findElement(By.name("username")).sendKeys("Raksha");;
		System.out.println("This is fourth test");
	}
	
	@Test
	public void passwordTest() {
		driver.get("https://crmpro.com/index.html");
		driver.findElement(By.name("password")).sendKeys("Thakre");
		System.out.println("This is fifth test");
	}
}
