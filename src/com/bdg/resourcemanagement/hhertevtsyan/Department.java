package com.bdg.resourcemanagement.hhertevtsyan;

import com.bdg.resourcemanagement.hhertevtsyan.enums.DepartmentType;

import java.util.Arrays;

public class Department {

    private DepartmentType departmentType;
    private String departmentName;
    private Employee departmentHead;
    private Employee [] employees;

    public Department (final DepartmentType departmentType, final String departmentName, final Employee departmentHead, final Employee [] employees) {
        this.departmentType = departmentType;
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
        this.employees = employees;
    }

//    public Department (final DepartmentType departmentType, final String departmentName, final Employee [] employees) {
//        this.departmentType = departmentType;
//        this.departmentName = departmentName;
//        this.employees = employees;
//    }
//
//    public Department (final DepartmentType departmentType, final String departmentName) {
//        this.departmentType = departmentType;
//        this.departmentName = departmentName;
//    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getDepartmentHead() {
        return departmentHead;
    }

//    public void setDepartmentHead(Employee departmentHead) {
//        this.departmentHead = departmentHead;
//    }

    public Employee[] getEmployees() {
        return employees;
    }

//    public void setEmployees(Employee[] employees) {
//        this.employees = employees;
//    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentType=" + departmentType + '\'' +
                ", departmentHead=" + departmentHead + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
