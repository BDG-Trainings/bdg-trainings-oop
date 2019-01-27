package com.bdg.vkaramyan;

public class Employee {
	
	int id;
	String firstName;
	String lastName;
	int salary;
	
	public Employee (int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
	}
	
	public int getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return "firstName, lastName";
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		int annual = salary * 12;
		return annual;
	}
	
	public int raiseSalary(int percent) {
		int salary_raise = (salary * 50/100)+ salary;
		return salary_raise;		
	}
	
	public String toString() {
		return String.format("Employee[id = %03d, name = firstName, name = lastName, salary = %03d]", getID(), getFirstName(), getLastName(), getSalary());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp =  new Employee(1, "Vika", "Karamyan", 300000);
		System.out.println(emp);
		emp.setSalary(450000);
		System.out.println(emp.getAnnualSalary());
		System.out.println(emp.raiseSalary(20));

	}

}
