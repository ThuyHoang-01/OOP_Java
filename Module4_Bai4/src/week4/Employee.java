package week4;

public class Employee extends Person{

	private double salary;

	public double getSalary() {
		return salary;
	}
		

	public Employee(String name, String birthday, double salary) {
		super(name, birthday);
		this.salary = salary;
	}



	public Employee(String name, String birthday) {
		super(name, birthday);
	}


	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
	
	
}
