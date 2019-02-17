package com.bdg.resourcemanagement.osahakyan;

import java.util.Arrays;

public final class Department {

    private final DepartmentType departmentType;
    private final String departmentName;
    private final Employee departmentHead;
    private final Employee[] employees;

    public Department(DepartmentType departmentType, String departmentName,  Employee departmentHead, Employee[] employees) {
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
        return "Department (" +
                "departmentType: " + departmentType +
                ", departmentName: '" + departmentName +
                ", departmentHead: " + departmentHead +
                ", employees: " + Arrays.toString(employees) +
                ")";
    }
}
