package com.bdg.resourcemanagement.aghazaryan;

public class Department {

    private DepartmentType departmentType;
    private String departmentName;
    private Employee departmentHead;
    private Employee[] employees;


    public Department (DepartmentType departmentType, String departmentName, Employee departmentHead, Employee[] employees) {

        this.departmentType = departmentType;
        this.departmentHead = departmentHead;
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public DepartmentType getDepartmentType (){
        return departmentType;
    }

    public String getDepartmentName (){
        return departmentName;
    }

    public Employee getDepartmentHead() {
        return departmentHead;
    }

    public Employee[] getEmployees(){
        return employees;
    }
}
