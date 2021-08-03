package myTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonTests extends BaseClass{
	@Test 
	public void usernameTest() {
		driver.findElement(By.name("customerName")).sendKeys("Raksha");;
		System.out.println("This is sixth test");
	}
	
	@Test
	public void emailTest() {
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("ap_email")).sendKeys("rakshathakre@gmail.com");
		System.out.println("This is seventh test");
	}
}
