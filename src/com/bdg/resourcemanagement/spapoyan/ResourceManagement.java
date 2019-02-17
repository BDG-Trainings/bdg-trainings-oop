package com.bdg.resourcemanagement.spapoyan;

public class ResourceManagement {

    Department[] departments;
    private int currentIndex;

    public ResourceManagement(final int departmentSize) {
        this.departments = new Department[departmentSize];
    }

    public boolean addDepartment(final Department department) {
        if (currentIndex < this.departments.length){
            this.departments[currentIndex] = department;
            currentIndex++;
            return true;
        }
        System.out.println("Departments is full");
        return false;

    }
}
