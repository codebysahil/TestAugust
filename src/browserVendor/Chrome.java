package browserVendor;

import browser.BrowserUtil;

public class Chrome extends  BrowserUtil{
     @Override	
	public void click() {
		System.out.println("Chrome Clicking");
	}

     
     public void launchURL() {
    	 System.out.println("Launch URL Chrome");
     }
}
