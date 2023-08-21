package oop_Abstract;

public abstract class Page {
	
	 public Page() {
		 System.out.println("Page class constructor");
	 }
	public abstract   void title();
	public abstract   void url();
	public abstract   void header();
	
	public void loadingPage() {
		System.out.println("Page class loadingPage method ");
	}
	public final void logo() {
		System.out.println("logo method of page");
	}
	public static void footer() {
		System.out.println("page--footers ");
	}

}
