package seleniumPracticeSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {
	
	WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);	
	}
	
	public void doClick(By locator) {
		getElement(locator).click();	
	}
	
	public List <String> getElementsTextList(By locator) {
		List <String> textList = new ArrayList<String>();
		List<WebElement> elementsList = getElements(locator);
		
		for(WebElement e : elementsList) {
			if(!e.getText().isEmpty()) {
				textList.add(e.getText());
			}	
		}
		return textList;
	}
	
	public void doSelectDropdownByIndex(By locator, int index) {
		Select sel_obj = new Select(getElement(locator));
		sel_obj.selectByIndex(index);	
	}
	
	public void doSelectDropdownByVisText(By locator, String visText) {
		Select sel_obj = new Select(getElement(locator));
		sel_obj.selectByVisibleText(visText);	
	}
	
	public void doSelectDropdownByValue(By locator, String value) {
		Select sel_obj = new Select(getElement(locator));
		sel_obj.selectByValue(value);	
	}
	
//this method will select the dropdown values without the use of above 3 methods
	public void doSelectDropdownValue(By locator, String value) {
		Select sel_obj = new Select(getElement(locator));
		List <WebElement> optionsList = sel_obj.getOptions();
		
		for(WebElement e : optionsList) {
			if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}
	
//this method will select the dropdown value without select class methods
	public void doSelectWithOutSelectClass(By locator, String value) {
		List <WebElement> list = getElements(locator);
		
		for(WebElement e : list) {
			if(e.getText().equals(value)) {
				e.click();
			}
		}
	}
	
	public void doSelectFromJQueryDropdown(By locator, String... options) {
		List <WebElement> eleList = getElements(locator);
		
		if(!options[0].equalsIgnoreCase("All")) {
			for(int i = 0; i<=eleList.size(); i++) {
				String text = eleList.get(i).getText();
				
				for(int j = 0; j<options.length; j++) {
					if(text.equals(options[j])) {
						eleList.get(i).click();
						break;
					}
				}
			}
		}
		
		else {
		try {
			for(int i = 0; i<eleList.size(); i++) {
				eleList.get(i).click();
			}
		}
		catch(Exception e) {
			
		}
	}	
}
	public void doDeSelectInJQyeryDropdown(By locator, String... options) {
		List <WebElement> eleList = getElements(locator);
		
		if(!options[0].equalsIgnoreCase("All")) {
			for(WebElement e : eleList) {
				String text = e.getText();
				
				for(int j = 0; j<options.length; j++) {
					if(text.equals(options[j])) {
							e.click();
							break;			
					}
				}
			}
		}
		else {
			for(WebElement e : eleList) {
					e.click();
			}	
		}
		
	}
	
	public void doSelectFromSearchBar(By mainLocator, By locator, 
			String enteredValue, String expValue) throws InterruptedException {
		
		doSendKeys(mainLocator, enteredValue);
		Thread.sleep(5000);
		List<WebElement> eleList = getElements(locator);

		for(WebElement e : eleList) {
			if(e.getText().equals(expValue)) {
				e.click();
			}
		}
	}
}










