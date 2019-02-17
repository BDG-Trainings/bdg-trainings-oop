package com.bdg.resourcemanagement.vkaramyan;

import java.util.Arrays;

public class Department {
	
	private DepartmentType departmentType; 
	private String departmentName;
	private Employee departmentHead;
	private Employee[] employees;
	
	public Department(final String departmentName, final Employee departmentHead, final Employee[] employees, final DepartmentType departmentType) {
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
		this.employees = employees;
		this.departmentType = DepartmentType.ACCOUNTING;
		this.departmentType = DepartmentType.ENGINEERING;
		this.departmentType = DepartmentType.CEO;
		this.departmentType = DepartmentType.MARKETING;
		this.departmentType = DepartmentType.SALES;
	}
	public DepartmentType getDepartmentType() {
		return departmentType;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public Employee getDepartmentHead() {
		return departmentHead;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	@Override
	public String toString() {
		return "Department [departmentType=" + departmentType + ", departmentName=" + departmentName
				+ ", departmentHead=" + departmentHead + ", employees=" + Arrays.toString(employees) + "]";
	}
	
}
