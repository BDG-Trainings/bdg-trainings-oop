package resource_management;

public class Employee {

	private double salary;
	private Person person;
	private Department department;
	
	public Employee (double salary, Person person, Department department ) {
		this.salary = salary;
		this.person = person;
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
	    this.salary = salary;
}
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
	    this.person = person;
}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
	    this.department = department;
}
	
}