package com.bdg.agalayan.Lessons_09;

public class Employee{
    private double salary;
    private Person person;


    public Employee(double salary, Person person) {
        this.salary = salary;
        this.person = person;

    }

    public double getSalary() {
        return salary;
    }

    public Person getPerson() {
        return person;
    }



    public void setPerson(Person person) {
        this.person = person;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
