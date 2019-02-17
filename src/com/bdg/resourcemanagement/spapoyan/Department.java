package com.bdg.resourcemanagement.spapoyan;

import java.util.Arrays;

public class Department {

        private DepartmentType departmentType;
        private String departmentName;
        private Employee departmentHead;
        private Employee[] employees;

    public Department(DepartmentType departmentType, String departmentName, Employee departmentHead, Employee[] employees) {
        this.departmentType = departmentType;
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
        this.employees = employees;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getDepartmentHead() {
        return departmentHead;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentType=" + departmentType +
                ", departmentName='" + departmentName + '\'' +
                ", departmentHead=" + departmentHead +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
