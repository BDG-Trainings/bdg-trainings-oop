package com.bdg.vqertikyan.resourcemanagement;

public class Employee {
    private double salary;
    private Person person;
    private Department department;


    public Employee(final double salary, final Person person, final Department department) {
        this.salary = salary;
        this.person = person;
        this.department = department;
    }

    public Employee(final double salary, final Person person) {
        this.salary = salary;
        this.person = person;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(final Person person) {
        this.person = person;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(final Department department) {
        this.department = department;
    }

}
