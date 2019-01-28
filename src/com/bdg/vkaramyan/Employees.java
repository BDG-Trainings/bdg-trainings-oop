package com.bdg.vkaramyan;

public class Employees {
	
	private double salary;
	private Person person;
	private Department department;
	
	public Employees(final double salary, final Person person, final Department department) {
		this.salary = salary;
		this.person = person;
		this.department =  department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
