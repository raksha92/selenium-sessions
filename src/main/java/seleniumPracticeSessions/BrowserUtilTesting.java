package seleniumPracticeSessions;

public class BrowserUtilTesting {

	public static void main(String[] args) {

		BrowserUtils obj = new BrowserUtils();
		obj.initDriver("chrome");
		obj.launchApp("https://www.google.co.in/");
		String title = obj.getTitle();
		System.out.println(title);
	}
}
