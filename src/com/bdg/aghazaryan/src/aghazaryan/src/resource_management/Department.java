package resource_management;

public class Department<departmentHeadEmployee> {
	
	private String departmentName;
	private Employee[] employees;
	private Employee departmentHeadEmployee;
	double departmentSalary;
	
public Department (String departmentName, Employee[] employees, Employee departmentHeadEmployee, double departmentSalary ) {
	
	this.departmentName = departmentName;
	this.employees = employees;
	this.departmentHeadEmployee = departmentHeadEmployee;
	this.departmentSalary = departmentSalary;
}
	public String getDepartmentName() {
		return departmentName;
	
}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Employee[] getEmployees() {
		return employees;
	}
	
	public void setEmployee (Employee[] employees) {
		this.employees = employees;
	}
	
	public double getDepartmentSalary() {
		return departmentSalary;
	}
   
	public void setDepartmentSalary(double departmentSalary) {
	   this.departmentSalary = departmentSalary;
   }
}
