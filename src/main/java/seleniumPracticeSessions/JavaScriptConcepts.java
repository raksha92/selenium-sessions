package seleniumPracticeSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptConcepts {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtils bs = new BrowserUtils();
		WebDriver driver = bs.initDriver("chrome");

		bs.launchApp("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title1 = jsUtil.getTitle();
		System.out.println(title1);
		
		jsUtil.refreshPage();
		
		jsUtil.generateAlert("this is my code");
		
		System.out.println(jsUtil.getInnerText());
		WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
		jsUtil.drawBorder(element);
		
		jsUtil.changeColor(element, "rgb(0, 200, 0)");
		jsUtil.clickOnElementByJS(element);
		
		jsUtil.scrollDownPage();
		
		jsUtil.scrollUpPage();
		
		jsUtil.scrollUptoSomeRange(500);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		jsUtil.scrollIntoView(ele);
		
		jsUtil.sendKeysUsingId("ap_email", "Raksha");
	}

}
