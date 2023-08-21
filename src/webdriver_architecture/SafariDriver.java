package webdriver_architecture;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("launch SafariDriver");
	}

	@Override
	public void findElement() {
		System.out.println("SafariDriver browser find element");

	}

	@Override
	public void findElements() {
		System.out.println("SafariDriver browser find elements");

	}

	@Override
	public void click(String element) {
		System.out.println("SafariDriver browser clicked element " + element);

	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("SafariDriver browser clicked element " + element + "value : " + value);

	}

	@Override
	public void get(String url) {
		System.out.println("SafariDriver browser getting URL " + url);

	}

	@Override
	public String getTitle() {
		String title = "Google fiSafariDriver";
		return title;
	}

	@Override
	public void close() {
		System.out.println("SafariDriver browser closed");

	}

}
