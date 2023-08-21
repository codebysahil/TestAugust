package OOP_Encapsulation;

public class Browser {
	
	public void launchChromeBrowser() {
		System.out.println("launch the Chrome browser");
		checkOSCompatible();
		checkRamSize();
		checkChromeVersion();
		checkChromeServices();
		System.out.println("Browser chrome is launched ");
		
	}
	
	private void checkOSCompatible() {
		System.out.println("check os compatibility");
	}
	
	private void checkRamSize() {
		System.out.println("check RAM size");
	}
   
	
	private void checkChromeVersion() {
		System.out.println("check chrome version");
	}

	
	private void checkChromeServices() {
		System.out.println("check chrome version");
	}
}
