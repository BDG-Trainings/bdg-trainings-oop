package com.bdg.hhakobyan;

public class Department {

    private String departmentName;
    Employee [] employees;
    Employee departmentHeadEmployee;
    private double departmentSalary;

    public Department (String departmentName){
    }

    public Department (String departmentName, Employee [] employees, Employee departmentHeadEmployee, double departmentSalary){
        this.departmentName = departmentName;
        this.employees = employees;
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.departmentSalary = departmentSalary;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setDepartmentHeadEmployee(Employee departmentHeadEmployee) {
        this.departmentHeadEmployee = departmentHeadEmployee;
    }

    public void setDepartmentSalary(double departmentSalary) {
        this.departmentSalary = departmentSalary;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public Employee[] getEmployees() {
        return this.employees;
    }

    public Employee getDepartmentHeadEmployee() {
        return this.departmentHeadEmployee;
    }

    public double getDepartmentSalary() {
        return this.departmentSalary;
    }

    @Override
    public String toString() {
        return "Department name: " + this.departmentName + "\n\nEmployee1: " + this.employees[0].getPerson() + this.employees[0].toString() + "\n\nEmployee2: " +
                this.employees[1].getPerson() + this.employees[1].toString() +"\n\nDepartment Head: " + departmentHeadEmployee.getPerson()
                + "\nDepartment salary: " + this.departmentSalary;
    }


}

