package com.bdg.resourcemanagement.aghazaryan.service;

        import com.bdg.resourcemanagement.aghazaryan.DepartmentType;
        import com.bdg.resourcemanagement.aghazaryan.Department;
        import com.bdg.resourcemanagement.aghazaryan.Employee;


public class DepartmentService {
    public Department create( DepartmentType departmentType,  String departmentName,  Employee departmentHead,  Employee[] employees){

        Department department = new Department(departmentType,departmentName, departmentHead, employees);
        return department;
    }
}