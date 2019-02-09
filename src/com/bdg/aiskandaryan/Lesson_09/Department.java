package com.bdg.aiskandaryan.Lesson_09;

public class Department {
    private String departmentName;
    private Employee [] employees;
    private Employee departmentHeadEmployee;
    private double budget;

    public Department(final String departmentName, final Employee[] employees, final Employee departmentHeadEmployee, final double budget) {
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.departmentName = departmentName;
        this.employees = employees;
        this.budget = budget;
    }

    public void setDepartmentName(final String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentHeadEmployee(final Employee departmentHeadEmployee) {
        this.departmentHeadEmployee = departmentHeadEmployee;
    }

    public Employee getDepartmentHeadEmployee() {
        return departmentHeadEmployee;
    }

    public double getBudget() {
        return budget;
    }

    public Employee [] getEmployees() {
        return employees;
    }

    public boolean addEmployee(final Employee employee) {
        int employeesLength = employees == null? 0 : employees.length; // if employees array is null, then it's length is 0
/*        if (employees == null) {
            employeesLength = 0;
        } else {
            employeesLength = employees.length;
        } */
        Employee [] newEmployees = new Employee[employeesLength + 1];
        for (int i = 0; i < employeesLength; i++) {
            newEmployees[i] = employees[i];
        }
        newEmployees[employeesLength] = employee;
        employee.setDepartment(this);
        employees = newEmployees;
        return true;
    }

    public boolean removeEmployee(final Employee employee) {
        int employeesLength = employees == null? 0 : employees.length;
        if (employeesLength > 0) {
            Employee [] newEmployees = new Employee[employees.length - 1];
            int indexDelta = 0;
            for (int i = 0; i + indexDelta < employees.length; i++) {
                if (employee.equals(employees[i])) {
                    indexDelta = 1;
                }
                newEmployees[i] = employees[i + indexDelta];
            }
            employees = newEmployees;
            return true;
        }
        return false;
    }
}
