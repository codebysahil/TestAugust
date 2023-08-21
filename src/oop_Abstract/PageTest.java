package oop_Abstract;

public class PageTest {

	public static void main(String[] args) {
	
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.header();
		lp.doLogin("sahil", "test");
		lp.logo();
		Page.footer();
		LoginPage.footer();
		
		// top casting with the parent class reference variable?
		System.out.println("-----------------------------");
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		
	}

}
