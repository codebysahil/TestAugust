package udemyLearning;

public class ChildSuper extends SuperParent {
	
	int c,d;
	
	public ChildSuper(int c,int d) {
		super;
		c = this.c;
		d = this.d;
		
	}
	@Override
	void f1() {
		super.f1();;
		System.out.println("inside overridden child f1");
	}

}
