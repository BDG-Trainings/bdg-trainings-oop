package com.bdg.resourcemanagement.osahakyan.Service;

import com.bdg.resourcemanagement.osahakyan.Department;
import com.bdg.resourcemanagement.osahakyan.DepartmentType;
import com.bdg.resourcemanagement.osahakyan.Employee;

public final class DepartmentService {

    public Department create(final DepartmentType departmentType,final String departmentName,  final Employee departmentHead, final Employee[] employees){
        return new Department(departmentType,departmentName, departmentHead, employees);
    }
}
