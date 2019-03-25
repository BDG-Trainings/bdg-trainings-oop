package com.bdg.npetrosyan.resourceManagement;

public class Department {
    private String departmentName;
    private Employee[] employees;
    private Employee departmentHeadEmployee;
    private double departmentSalary;

    public Department(final String departmentName, final Employee[] employees, final Employee departmentHeadEmployee, final double departmentSalary) {
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.departmentName = departmentName;
        this.employees = employees;
        this.departmentSalary = departmentSalary;
    }
}

