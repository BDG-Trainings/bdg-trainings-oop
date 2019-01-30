package com.bdg.hhakobyan;

public class Employee {

    private  double salary;
    private Person person;

    public Employee (double salary, Person person){
        this.salary = salary;
        this.person = person;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getSalary() {
        return this.salary;
    }

    public Person getPerson() {
        return this.person;
    }

    public String toString() {
        return "\nSalary: " + salary;
    }
}
