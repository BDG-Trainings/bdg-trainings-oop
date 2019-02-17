package com.bdg.resourcemanagement.warustamyan;

import java.util.Arrays;

public final class Department {

    private String departmentName;
    private DepartmentType departmentType;
    private Employee departmentHead;
    private Employee[] employees;

    public Department(final String departmentName, final DepartmentType departmentType, final Employee departmentHead, final Employee[] employees) {
        this.departmentName = departmentName;
        this.departmentType = departmentType;
        this.departmentHead = departmentHead;
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
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
                "departmentName='" + departmentName + '\'' +
                ", departmentType=" + departmentType +
                ", departmentHead=" + departmentHead +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
