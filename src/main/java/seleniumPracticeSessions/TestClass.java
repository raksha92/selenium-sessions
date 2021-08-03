package seleniumPracticeSessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtils br = new BrowserUtils();
		WebDriver driver = br.initDriver("chrome");
		
		br.launchApp("http://automationpractice.com/");
		
		ElementUtils eleUtil = new ElementUtils(driver);
		
		By mainLocator = By.id("search_query_top");
		By locator = By.xpath("//div[@class='ac_results']/ul/li");
		
		eleUtil.doSelectFromSearchBar(mainLocator, locator, "dress", 
				"T-shirts > Faded Short Sleeve T-shirts");
		
		

		
//		driver.findElement(By.id("justAnInputBox")).click();
//		
//		By locator = By.cssSelector(".comboTreeItemTitle");
//		
//		eleUtil.doSelectFromJQueryDropdown(locator, "all"); 
//		
//		eleUtil.doDeSelectInJQyeryDropdown(locator, "choice 6 1");
		
	
//		By locator = By.xpath("//select[@id = 'Form_submitForm_Country']/option");
//		eleUtil.doSelectWithOutSelectClass(locator, "Singapore");
		
		

//		By locator = By.id("Form_submitForm_Country");
//		eleUtil.doSelectDropdownValue(locator, "Singapore");
		
		
//		By locator = By.id("Form_submitForm_Country");		
//		eleUtil.doSelectDropdownByVisText(locator, "Singapore");
		
		
		
//		By links = By.xpath("//div[@class='navFooterLinkCol navAccessibility']/ul/li/a");
//		
//		List<String> textList = eleUtil.getElementsTextList(links);
//		
//		for(String e : textList) {
//			System.out.println(e);
//		}
//		
		
//		By links = By.tagName("a");
//		List <WebElement> linksList = eleUtil.getElements(links);		
//		System.out.println(linksList.size());		
//		for(WebElement e : linksList) {
//			if(!e.getText().isEmpty()){
//				System.out.println(linksList.indexOf(e) + e.getText());
//			}
//		}
//
//		By images = By.tagName("img");
//		List <WebElement> listImages = eleUtil.getElements(images);
//		
//		for(WebElement e : listImages) {
//			String altAttr = e.getAttribute("alt");
//			System.out.println(altAttr);
//		}
		
		
		
//		By emailId = By.id("input-email");
//		By pwdId = By.id("input-password");
//		
//		eleUtil.doSendKeys(emailId, "test@gmail.com");
//		eleUtil.doSendKeys(pwdId, "test@123");
//		
//		String title = br.getTitle();
//		System.out.println(title);
//		
//		br.closeBrowser();
	
	}
}
