package com.bdg.agalayan.Lessons_09;

public class Employee{
    private double salary;
    private Lessons_09.Person person;
    private Department departments;

    public Employee(double salary, Lessons_09.Person person, Department departments) {
        this.salary = salary;
        this.person = person;
        this.departments = departments;
    }

    public double getSalary() {
        return salary;
    }

    public Lessons_09.Person getPerson() {
        return person;
    }
    public Department getDepartament() {
        return departments;
    }

    public void setPerson(Lessons_09.Person person) {
        this.person = person;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.departments = departments;
    }

}
