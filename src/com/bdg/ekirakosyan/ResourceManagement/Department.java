package com.bdg.ekirakosyan.ResourceManagement;

import java.util.Arrays;

public class Department {

    private String departmentName;
    private Employee employees[];
    private Employee departmentHeadEmployee;
    private double departmentSalary;

    public Department(String departmentName, Employee[] employees, Employee departmentHeadEmployee, double departmentSalary) {
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

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee getDepartmentHeadEmployee() {
        return departmentHeadEmployee;
    }

    public void setDepartmentHeadEmployee(Employee departmentHeadEmployee) {
        this.departmentHeadEmployee = departmentHeadEmployee;
    }

    public double getDepartmentSalary() {
        return departmentSalary;
    }

    public void setDepartmentSalary(double departmentSalary) {
        this.departmentSalary = departmentSalary;
    }

    @Override
    public String toString() {
        String departmentInfo = "Department Name: "+ getDepartmentName()+", ";
        for (int i = 0; i < getEmployees().length; i++) {
            departmentInfo += " Employee"+(i+1)+" Name: " + getEmployees()[i].getPerson().getFirstName()+" " + getEmployees()[i].getPerson().getLastName()+", ";
        }
        departmentInfo += " Department Head Employee: " + getDepartmentHeadEmployee().getPerson().getFirstName()+" "+getDepartmentHeadEmployee().getPerson().getLastName()+", ";
        departmentInfo += " Department Salary: " + getDepartmentSalary();

        return departmentInfo;
    }

    public String getEmployeesInfo(){
        String info = "";
        for (int i = 0; i < getEmployees().length; i++) {
            info += " Employee-"+(i+1)+" FullName: " + getEmployees()[i].getPerson().getFirstName()+" " + getEmployees()[i].getPerson().getLastName();
            if(i<getEmployees().length-1){
                info += ", ";
            }
        }
        return info;
    }
    public boolean removeEmployee(final Employee employee){
        Employee[] newEmployees = new Employee[employees.length - 1];
        int j = 0;
        for (int i = 0; i < employees.length; i++) {

            if(!(employees[i].getEmployeeFullName().contentEquals(employee.getEmployeeFullName())) ){
                newEmployees[j] = employees[i];
                j++;
            }
        }
        employees = newEmployees;
        return true;
    }
    public boolean addEmployee(final Employee employee) {
        Employee[] newEmployees = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newEmployees[i] = employees[i];
        }
        newEmployees[employees.length] = employee;
        employee.setDepartment(employee.getDepartment());  //employee.setDepartment(this);
        employees = newEmployees;

        return true;
    }


}
