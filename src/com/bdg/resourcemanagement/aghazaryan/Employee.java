package com.bdg.resourcemanagement.aghazaryan;

public class Employee {

    private double salary;
    private Person person;
    private Department department;

    public Employee(double salary, Person person, Department department) {
        this.salary = salary;
        this.person = person;
        this.department = department;
    }

    public double getSalary (){
        return salary;
    }

    public Person getPerson(){
        return person;
    }

    public Department getDepartment (){
        return department;
    }
}
