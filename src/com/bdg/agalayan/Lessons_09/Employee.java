package com.bdg.agalayan.Lessons_09;

public class Employee{
    private double salary;
    private Person person;
    private Department departments;

    public Employee(double salary, Person person, Department departments) {
        this.salary = salary;
        this.person = person;
        this.departments = departments;
    }

    public double getSalary() {
        return salary;
    }

    public Person getPerson() {
        return person;
    }
    public Department getDepartament() {
        return departments;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.departments = departments;
    }

}
