package browserVendor;

import browser.BrowserUtil;

public class Safari extends BrowserUtil {
	@Override
	public void click() {
		System.out.println(" safari---clicking");
	}
	public void launchURL() {
   	 System.out.println("Launch URL safari");
    }

}
