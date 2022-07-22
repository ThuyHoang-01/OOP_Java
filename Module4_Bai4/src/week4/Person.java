package week4;

public class Person {

	private String name;
	private String birthday;
	
	public String getName() {
		return name;
	}
	
	public Person(String name, String birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + "]";
	}
	
	
	
}
