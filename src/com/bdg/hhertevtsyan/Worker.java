package com.bdg.hhertevtsyan;

public class Worker {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Worker(final int id, final String firstName, final String lastName, final int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary = salary + salary * percent / 100;
        return salary;
    }

    public String toString() {
        return "Employee [id = " + id + ", name = " + getName() + ", salary = " + salary + "]";
    }

}
