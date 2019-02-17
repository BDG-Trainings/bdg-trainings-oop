package com.bdg.resourcemanagement.vqertikyan.service;

import com.bdg.resourcemanagement.vqertikyan.Department;
import com.bdg.resourcemanagement.vqertikyan.DepartmentType;
import com.bdg.resourcemanagement.vqertikyan.Employee;

public class DepartmentService {
    public Department create(final DepartmentType departmentType, final String departmentName, final Employee departmentHead, final Employee[] employees){

        return new Department(departmentType, departmentName, departmentHead, employees);
    }
}
