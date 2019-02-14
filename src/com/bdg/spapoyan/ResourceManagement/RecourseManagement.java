package com.bdg.spapoyan.ResourceManagement;

public class RecourseManagement {

    private Department[] departments;

    public void addEmployeeToDepartment(Employee emp, String departmentName){
        Department department = findDepartmentByName(departmentName);
        if (department != null){
            department.getEmployees(emp);
        }


    }

    public void removeEmployeeToDepartment(Employee emp, String departmentName){

    }

    public Employee findEmployeeByName(){
        return null;

    }

    public Department findDepartmentByName(final String departmentName){
        return null;
    }


    public Department getDepartmentWithMaxSalary(){
        return null;
    }

}
