package webdriver_architecture;

public class ChromeDriver  implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("launch google chrome");
	}

	@Override
	public void findElement() {
		System.out.println("Chrome browser find element");
		
	}

	@Override
	public void findElements() {
		System.out.println("Chrome browser find elements");
		
	}

	@Override
	public void click(String element) {
		System.out.println("Chrome browser clicked element " + element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Chrome browser clicked element " + element + "value : " + value);
		
	}

	@Override
	public void get(String url) {
		System.out.println("Chrome browser getting URL " + url);
		
	}

	@Override
	public String getTitle() {
		String title="Google chrome";
		return title;
	}

	@Override
	public void close() {
		System.out.println("Chrome browser closed");
		
	}

}
