package com.bdg.vkaramyan.resourceManagement;

public class Department {
	
	private String departmentName;
	private Employees [] employees;
	private Employees departmentHeadEmployee;
	private double departmentSalary;
	
	public Department (final String departmentName, final Employees [] employees, final Employees departmentHeadEmployee, final double departmentSalary) {
		this.departmentName = departmentName;
		this.employees = employees;
		this.departmentHeadEmployee = departmentHeadEmployee;
		this.departmentSalary = departmentSalary;
				
	}
	
	public String getDepartmentName() {
		return departmentName;
		
	}

	public Employees [] getEmployees() {
		return employees;
	}
	
	public Employees getDepartmentHeadEmployee() {
		return departmentHeadEmployee;
	}
	
	public double getDepartmentSalary() {
		return departmentSalary;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
		
	}

	public void setEmployees(Employees [] employees) {
		this.employees = employees;
	}
	
	public void setDepartmentHeadEmployee(Employees departmentHeadEmployee) {
		this.departmentHeadEmployee = departmentHeadEmployee;
	}
	
	public void setDepartmentSalary(double departmentSalary) {
		this.departmentSalary = departmentSalary;
	}
}
