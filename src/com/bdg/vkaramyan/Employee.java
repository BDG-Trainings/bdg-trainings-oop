package com.bdg.vkaramyan;

public class Employee {


    //same make private
	int id;
	String firstName;
	String lastName;
	int salary;
	
	public Employee (final int id, final String firstName, final String lastName, final int salary) {
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
		return "firstName lastName";
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
	
	@Override
	public String toString() {
		return "Employee[id = " + id + ", name = " + firstName + " " + lastName + ", salary = " + salary +"]";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp =  new Employee(1, "Vika", "Karamyan", 300000);
		System.out.println(emp);
		emp.setSalary(450000);
		System.out.println("Annual salary is:" + emp.getAnnualSalary());
		System.out.println("Raise salary:" + emp.raiseSalary(20));
		

	}

}
