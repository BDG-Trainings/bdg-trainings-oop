package com.bdg.vkaramyan.resourceManagement;

public class Employees {
	
	private double salary;
	private Employees employees; //<---  change to Employee
	private Department department;
	
	public Employees(final double salary, final Employees employees, final Department department) {
		this.salary = salary;
		this.employees = employees;
		this.department =  department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Employees getEmployees() {
		return employees;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
