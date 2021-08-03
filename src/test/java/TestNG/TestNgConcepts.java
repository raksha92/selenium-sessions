package TestNG;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNgConcepts {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite - sequence 1");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test - sequence 2");
	}
	@BeforeClass 
	public void beforeClass() {
		System.out.println("This is before class - sequence 3");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method - sequence 4");
	}
	@Test (priority = 1)
	public void logInTest() {
		System.out.println("This is test case for logIn - sequence 5");
	}
	
	@Test (priority = 3)
	public void SearchProdTest() {
		System.out.println("This is test case for searchProd - sequence 5");
	}
	
	@Test (priority = 2)
	public void checkProdTest() {
		System.out.println("This is test case for checkProd - sequence 5");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method - sequence 6");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class - sequence 7");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test - sequence 8");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite - sequence 9");
	}
}
