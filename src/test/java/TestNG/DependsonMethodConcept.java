package TestNG;
import org.testng.annotations.Test;
public class DependsonMethodConcept {
	
	String name = "Raksha";
	
	@Test (expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void loginTest() {
		System.out.println("This is test case for login");
		int i = 9/0;
		DependsonMethodConcept dm = new DependsonMethodConcept();
		dm = null;
		String name = dm.name;
	}
	
	@Test 
	public void checkProdTest() {
		System.out.println("This is test case for checkProd");
	}
	
	@Test
	public void searchProdTest() {
		System.out.println("This is test case for searchProd");
	}
}

