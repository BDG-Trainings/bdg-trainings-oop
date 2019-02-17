package com.bdg.resourcemanagement.vqertikyan;

import com.bdg.resourcemanagement.vqertikyan.service.DepartmentService;

public class ResourceManagement {

    private Department[] departments;
    private int currentIndex;

    public ResourceManagement(final int departmentSize) {
        this.departments = new Department[departmentSize];
    }

    DepartmentService departmentService = new DepartmentService();

    public boolean addDepartment(final Department department) {
        if (currentIndex > departments.length){
            departmentService.create(department.getDepartmentType(), department.getDepartmentName(), department.getDepartmentHead(), department.getEmployees());
            currentIndex++;
            return true;
        }
        System.out.println("Departments is full");
        return false;
    }
}
