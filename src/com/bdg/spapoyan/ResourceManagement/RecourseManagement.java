package com.bdg.spapoyan.ResourceManagement;

public class RecourseManagement {

    private Department[] departments;

    public void addEmployeeToDepartment(Employee emp, String departmentName){
        Employee[] employees = new Employee[2];
        Department department = new Department(departmentName, employees, emp, 1000 );
            if(department != null){
                if (employees != null){

                }
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
