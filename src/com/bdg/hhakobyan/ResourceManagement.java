package com.bdg.hhakobyan;

import java.util.Scanner;

public class ResourceManagement {

    private Department departments [];
    Department dep = null;

/*
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
String userName;

// Enter username and press Enter
System.out.println("Enter username");
userName = myObj.nextLine();

System.out.println("Username is: " + userName);
}
*/

    public void addEmployeeToDepartment (Employee emp, String departmentName){

        Department dep = searchDepartment(departmentName);
        Employee [] employee_update = new Employee[dep.getEmployees().length +1];
        for (int i = 0; i < dep.getEmployees().length; i++)
        {
            employee_update[i] = dep.employees[i];
        }
        employee_update [dep.getEmployees().length] = emp;
        dep.employees = employee_update;
    }

    public void removeEmployeeFromDepartment (Employee emp, String departmentName){

        Department dep = searchDepartment(departmentName);
        Employee [] employee_update = new Employee[dep.getEmployees().length - 1];
        for (int i = 0; i < dep.getEmployees().length - 1; i++) {

            if (emp != dep.employees[i]) {
                employee_update[i] = dep.employees[i];
            }
        }
        dep.employees = employee_update;
    }

    public Department searchDepartment (String departmentName){

        for (int i=0; i < departments.length; i++){

            if (departments[i].getDepartmentName() == departmentName)
            {
                dep = departments [i];
            }
        } return  dep;
    }

    public Employee findEmployeeByName (String firstName, String lastName){

        Employee [] employees = null;
        Employee emp = null;

        for (int i =0; i < departments.length; i++ ) {

            dep = departments[i];
            employees = dep.getEmployees();
            for (int m = 0; m < employees.length - 1; m++) {

                if (employees[i].getPerson().getFirstName() == firstName && employees[i].getPerson().getLastName() == lastName){
                    emp = employees [i];
                }
            }
        }
        return emp;
    }



    public Department getDepartmentWithMaxSalary(){


        return this.dep;
    }
}
