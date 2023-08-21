package browserVendor;
import browser.BrowserUtil;
public class TestBrowser {

	public static void main(String[] args) {
		
		
		BrowserUtil bu = new Chrome();// ctrl + shift + o to import the package
		bu.sendKeys("sahil");//broswerutil
		bu.closeBrowser();// broswerutil
		bu.click(); // chrome class clock should be called
		
		System.out.println("-------------------------");
		Chrome c= new Chrome();
		c.click(); // crime
		c.launchURL(); // class crime
		c.sendKeys("chrome"); // browser utility
		c.closeBrowser(); //browser utility
		
		System.out.println("-------------------------");
		
		BrowserUtil bu1 = new Firefox();
		bu1.click();
		
System.out.println("-------------------------");
		
		BrowserUtil bu2 = new Safari();
		bu2.click();
		
		System.out.println("------final-------------------");
		BrowserUtil bu3 =null;
		String browserName = "Chrome ";
		if(browserName.equals("Chrome")) {
			bu3=new Chrome();
		}
		else if((browserName.equals("Safari"))) {
			bu3=new Safari();
			
		}
		else if((browserName.equals("Firefox"))) {
			bu3=new Firefox();
			
		}
		else {
			System.out.println("please enter a correct browser name");
		}
		bu3.click();
		
// because of the top casting one cannot access the methods of the individual class like here i can't access senKeys and closeBrowser of the browser utility class
	}
	
			
			

}
