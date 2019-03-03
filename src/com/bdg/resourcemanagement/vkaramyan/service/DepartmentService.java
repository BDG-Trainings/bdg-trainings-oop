package com.bdg.resourcemanagement.vkaramyan.service;

import com.bdg.resourcemanagement.vkaramyan.Department;
import com.bdg.resourcemanagement.vkaramyan.DepartmentType;
import com.bdg.resourcemanagement.vkaramyan.Employee;

public class DepartmentService {

    public Department create(final String departmentName, final Employee departmentHead, final Employee[] employees, final DepartmentType departmentType) {
        Department department = new Department(departmentName, departmentHead, employees, departmentType);
        return department;
    }

}
