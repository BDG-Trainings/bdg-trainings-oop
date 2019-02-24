package com.bdg.aghazaryan.src.aghazaryan.src.classexercises;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {

        return firstName + "_" + lastName;

    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;

    }

    public int raiseSalary(int percent) {

        this.salary = salary + salary*percent/100;
        return salary;


    }

    public String toString() {

        return String.format(" %d,  %d,  %d,  %d",  id, firstName, lastName, salary);
        // return "Employee[id= " + id + " firstName =" + firstName + " lastName =" + lastName + " id= " + id + "]";


    }
    public static void main (String[] args) {
        Employee employeeObj = new Employee(1, "Anahit", "Ghazaryan", 350000);
        System.out.println(employeeObj.id);
        System.out.println(employeeObj.firstName);
        System.out.println(employeeObj.lastName);
        System.out.println(employeeObj.salary);

    }

}

