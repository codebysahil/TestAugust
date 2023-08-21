package webdriver_architecture;

public class AmazonTest {
	static WebDriver driver; //global variable

	public static void main(String[] args) {

		String browser = "Chrome";
		if (browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			driver = new FireFoxDriver();
		}
		else {
			System.out.println("Please enter a correct browser");
		}
		// ChromeDriver driver = new ChromeDriver();
		// FireFoxDriver driver = new FireFoxDriver();
		// SafariDriver driver = new SafariDriver();
		driver.get("www.google.com");
		driver.click("clicking sign-in button");
		driver.sendKeys("username", "admin");
		driver.sendKeys("password", "test@123");
		driver.click("Login");
		String title = driver.getTitle();
		System.out.println(title + "Page title");
		driver.close();

	}

}
