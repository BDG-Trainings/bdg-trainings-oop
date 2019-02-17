package com.bdg.resourcemanagement.spapoyan.service;

import com.bdg.resourcemanagement.spapoyan.Department;
import com.bdg.resourcemanagement.spapoyan.DepartmentType;
import com.bdg.resourcemanagement.spapoyan.Employee;

public class DepartmentService {

    public Department create (final DepartmentType departmentType, final String departmentName, final Employee departmentHead, final Employee[] employees){
        Department department = new Department(departmentType, departmentName, departmentHead, employees);
        return department;
    }
}
