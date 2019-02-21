package com.bdg.agalayan.Lessons_09;

public class Department {
    private String departmentName;
    private Employee[] employees;
    private Employee departmentHeadEmployee;
    private double departmentBudget;

    public Department(String departmentName, Employee[] employees, Employee departmentHeadEmployee,
                      double departmentBudget){
        this.departmentName = departmentName;
        this.employees= employees;
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.departmentBudget=departmentBudget;
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

    public double getDepartmentBudget() {
        return departmentBudget;
    }

    public void setDepartmentName(String departamentName) {
        this.departmentName = departamentName;
    }

    public void setEmployees(Employee[]employees) {
         this.employees = employees;
    }

    public void setDepartmentHeadEmployee(Employee departamentHeadEmployee) {
        this.departmentHeadEmployee = departmentHeadEmployee;
    }

    public void setDepartmentBudget(double departmentBudget) {
        this.departmentBudget=departmentBudget;
    }
}
