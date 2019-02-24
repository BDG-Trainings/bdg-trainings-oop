package com.bdg.agalayan.Lessons_09;

public class Department {
    private DepartmentType departmentType;
    private String departmentName;
    private Employee[] employees;
    private Employee departmentHeadEmployee;
    private double departmentSalary;
    private int currentEmployee;

    public Department(DepartmentType departmentType, String departmentName,
                      Employee[] employees, Employee departmentHeadEmployee,
                      double departmentSalary) {
        this.departmentName = departmentName;
        this.employees = employees;
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.departmentSalary = departmentSalary;
        this.departmentType = departmentType;
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

    public void setEmployees(Employee employee) {
        if (currentEmployee < employees.length) {
            employees[currentEmployee] = employee;
            currentEmployee++;
        }
    }

    public void setDepartmentHeadEmployee(Employee departamentHeadEmployee) {
        this.departmentHeadEmployee = departmentHeadEmployee;
    }

    public void setDepartmentSalary(double departmentSalary) {

        this.departmentSalary = departmentSalary;
    }


    public DepartmentType getDepartmentType() {
        return departmentType;
    }


    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }


    }

