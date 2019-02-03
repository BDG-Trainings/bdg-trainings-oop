package com.bdg.spapoyan.ResourceManagement;

public class Department {
    private String departmentName;
    private Employee[] employees;
    private Employee departmentHeadEmployee;
    private double departmentSalary = 15;

    public Department (final String departmentName, final Employee[]employees, final Employee departmentHeadEmployee, final double departmentSalary) {
        this.departmentName = departmentName;
        this.employees = employees;
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.departmentSalary = departmentSalary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee[] getEmloyees() {
        return employees;
    }

    public Employee getDepartmentHeadEmployee() {
        return departmentHeadEmployee;
    }

    public double getDepartmentSalary() {
        return departmentSalary;
    }

    public void setDepartmentName(String departmenName) {
        this.departmentName = departmenName;
    }

    public void setEmloyees(Employee[] emloyees) {
        this.employees = emloyees;
    }

    public void setDepartmentHeadEmployee(Employee departmentHeadEmployee) {
        this.departmentHeadEmployee = departmentHeadEmployee;
    }

    public void setDepartmentSalary(double departmentSalary) {
        this.departmentSalary = departmentSalary;
    }

}
