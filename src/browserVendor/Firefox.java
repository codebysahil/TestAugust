package browserVendor;

import browser.BrowserUtil;

public class Firefox extends BrowserUtil {
	@Override
	public void click() {
		System.out.println(" firefox---clicking");
	}
	public void launchURL() {
   	 System.out.println("Launch URL Firefox");
    }

}
