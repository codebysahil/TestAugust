package OOP_Encapsulation;

public class User {
	
	private String name;
	private int age;
	private boolean isListed;
	public User(String name, int age, boolean isListed) {
		this.name = name;
		this.age = age;
		this.isListed = isListed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isListed() {
		return isListed;
	}
	public void setListed(boolean isListed) {
		this.isListed = isListed;
	}

	
	
}