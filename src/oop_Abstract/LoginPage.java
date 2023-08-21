package oop_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP class constructor");
	}

	@Override
	public void title() {
		System.out.println("Login Page title");
		
	}

	@Override
	public void url() {
		System.out.println("Login Page url");
		
	}

	@Override
	public void header() {
		System.out.println("Login Page header");
		
	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("Login with username "+un+"and password as " +pwd);		
	}

}
