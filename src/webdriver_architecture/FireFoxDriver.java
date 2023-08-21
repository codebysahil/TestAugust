package webdriver_architecture;

public class FireFoxDriver implements WebDriver {

	public FireFoxDriver() {
		System.out.println("launch fireFox");
	}

	@Override
	public void findElement() {
		System.out.println("fireFox browser find element");

	}

	@Override
	public void findElements() {
		System.out.println("fireFox browser find elements");

	}

	@Override
	public void click(String element) {
		System.out.println("fireFox browser clicked element " + element);

	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("fireFox browser clicked element " + element + "value : " + value);

	}

	@Override
	public void get(String url) {
		System.out.println("fireFox browser getting URL " + url);

	}

	@Override
	public String getTitle() {
		String title = "Google fireFox";
		return title;
	}

	@Override
	public void close() {
		System.out.println("fireFox browser closed");

	}

}
