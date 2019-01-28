package com.bdg.vqertikyan.resourcemanagement;

public class Department {

    private String departmentName;
    private Employee[] employees;
    private Employee departmentHeadEmployee;
    private double departmentSalary;


    public Department(final String departmentName, final Employee[] employees, final Employee departmentHeadEmployee, final double departmentSalary) {
        this.departmentName = departmentName;
        this.employees = employees;
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.departmentSalary = departmentSalary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(final String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(final Employee[] employees) {
        this.employees = employees;
    }

    public Employee getDepartmentHeadEmployee() {
        return departmentHeadEmployee;
    }

    public void setDepartmentHeadEmployee(final Employee departmentHeadEmployee) {
        this.departmentHeadEmployee = departmentHeadEmployee;
    }

    public double getDepartmentSalary() {
        return departmentSalary;
    }

    public void setDepartmentSalary(final double departmentSalary) {
        this.departmentSalary = departmentSalary;
    }

}
