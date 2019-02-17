package com.bdg.resourcemanagement.warustamyan.service;

import com.bdg.resourcemanagement.warustamyan.Department;
import com.bdg.resourcemanagement.warustamyan.DepartmentType;
import com.bdg.resourcemanagement.warustamyan.Employee;

public final class DepartmentService {

    public Department create(final String departmentName, final DepartmentType departmentType, final Employee departmentHead, final Employee[] employees) {
        return new Department(departmentName, departmentType, departmentHead, employees);
    }
}
