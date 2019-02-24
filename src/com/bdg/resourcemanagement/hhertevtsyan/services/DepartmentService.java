package com.bdg.resourcemanagement.hhertevtsyan.services;

import com.bdg.resourcemanagement.hhertevtsyan.Department;
import com.bdg.resourcemanagement.hhertevtsyan.Employee;
import com.bdg.resourcemanagement.hhertevtsyan.enums.DepartmentType;

public class DepartmentService {

    public Department create (final DepartmentType departmentType, final String departmentName, final Employee departmentHead, final Employee [] employees) {
        Department department = new Department(departmentType, departmentName, departmentHead, employees);
        return department;
    }
}
