package com.bdg.resourcemanagement.ekirakosyan.service;


import com.bdg.resourcemanagement.ekirakosyan.Department;
import com.bdg.resourcemanagement.ekirakosyan.DepartmentType;
import com.bdg.resourcemanagement.ekirakosyan.Employee;

public class DepartmentService {

   public Department create(final DepartmentType departmentType, final String departmentName, final Employee departmentHead, final Employee[] employees){
       Department department = new Department(departmentType, departmentName, departmentHead, employees);
       return department;

   }

}
