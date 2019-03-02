package com.bdg.resourcemanagement.vkaramyan;

public class ResourceManagement {

	private Department[] departments;
	private int currentIndex;

	public ResourceManagement(final int departmentSize) {
		this.departments = new Department[departmentSize];
	}

	public boolean addDepartment(final Department department) {
		if (currentIndex < this.departments.length) {
			this.departments[currentIndex] = department;
			currentIndex++;
			return true;
		}

		System.out.println("Departments is full");
		return false;
	}

	public void removeEmployeeFromDepartment(final Employee employee, final String departmentName) {

		for (Department department : departments) {
			if (department.getDepartmentName() == departmentName) {
				for (Employee employees : department.getEmployees()) {
					if (employees.getPerson().getFirstName() == employee.getPerson().getFirstName() && employee
							.getSalaryDetail().getSalaryAmount() == employee.getSalaryDetail().getSalaryAmount()) {
						employees = null;
					}

					System.out.println("Employee is removed");
				}
			}
		}
	}

	public Employee findEmployeeByName(SalaryDetail salaryDetail, Person person) {
		for (Department department : departments) {
			for (Employee employees : department.getEmployees()) {
				if (employees.getPerson() == person && employees.getSalaryDetail() == salaryDetail) {
					return employees;
				}
			}
		}

		return null;

	}

	public Department findDepartmentByName(final String departmentName, final Employee departmentHead,
			final Employee[] employees, final DepartmentType departmentType) {
		for (Department department : departments) {
			if (department.getDepartmentName() == departmentName && department.getDepartmentType() == departmentType) {
				return department;
			}
		}
		return null;
	}

	public Department getDepartmentWithMaxSalary() {
		int maxSalary = 0;
		for (Department department : departments) {
			for (Employee employees : department.getEmployees()) {
				if (employees.getSalaryDetail().getSalaryAmount() == maxSalary) {
					
					return department;
				}
			}

		}
		return null;
	}
}
