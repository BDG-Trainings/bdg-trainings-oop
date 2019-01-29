package com.bdg.agalayan.Lessons_09;

public class Department {
    private String departmentName;
    private Lessons_09.Employee[] employees;
    private Lessons_09.Employee departmentHeadEmplaoyee;
    private double departmentSalary;

    public Department(String departmentName, Lessons_09.Employee[] employees, Lessons_09.Employee departmentHeadEmplaoyee,
                      double departmentSalary){
        this.departmentName = departmentName;
        this.employees= employees;
        this.departmentHeadEmplaoyee = departmentHeadEmplaoyee;
        this.departmentSalary=departmentSalary;
    }
    public String getDepartmentName() {
        return departmentName;
    }

    public Lessons_09.Employee[] getEmployees() {
        return employees;
    }

    public Lessons_09.Employee getDepartmentHeadEmployee() {
        return departmentHeadEmplaoyee;
    }

    public double getDepartmentSalary() {
        return departmentSalary;
    }

    public void setDepartmentName(String departamentName) {
        this.departmentName = departamentName;
    }

    public void setEmployees(Lessons_09.Employee[]employees) {
        this.employees = employees;
    }

    public void setDepartmentHeadEmplaoyee(Lessons_09.Employee departamentHeadEmplaoyee) {
        this.departmentHeadEmplaoyee = departmentHeadEmplaoyee;
    }

    public void setDepartmentSalary(double departamentSalary) {
        this.departmentSalary = departmentSalary;
    }
}
