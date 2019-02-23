package com.bdg.agalayan.Lessons_09;

public class EmployeeService {
    private Employee[] employee;
    private int currentIndex;

    public  EmployeeService(Employee [] employee){
        this.employee=employee;
    }

    public boolean createEmployee(Employee employee1){
        if(currentIndex<employee.length){
            employee[currentIndex]=employee1;
            currentIndex++;
            return true;
        }
        return false;

    }
    public boolean removeEmployee(Employee employee1){
        if(currentIndex<employee.length){
            employee[currentIndex]=employee1;
            currentIndex--;
            return true;
        }
        return false;

    }



}
