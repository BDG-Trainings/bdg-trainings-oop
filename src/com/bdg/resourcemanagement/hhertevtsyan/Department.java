package com.bdg.resourcemanagement.hhertevtsyan;

public class Department {
    private String departmentName;
    private Employee[] employees;
    private Employee departmentHeadEmployee;
    private double departmentSalary;

    public Department(final String departmentName, final Employee[] employees, final Employee departmentHeadEmployee, final double departmentSalary) {
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.employees = employees;
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.departmentSalary = departmentSalary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Employee getDepartmentHeadEmployee() {
        return departmentHeadEmployee;
    }

    public double getDepartmentSalary() {
        return departmentSalary;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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


    @Override
    public String toString() {
        return "Department: [ Name = " + departmentName + ", Department Employees = " + employees.length + ", Department head = " +
                departmentHeadEmployee + ", Department slary = " + departmentSalary + "]";
    }
}
