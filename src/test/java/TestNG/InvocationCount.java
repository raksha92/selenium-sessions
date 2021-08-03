package TestNG;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test (invocationCount = 10)
	public void checkProdTest() {
		System.out.println("This is test case for checkProd");
	}
}
