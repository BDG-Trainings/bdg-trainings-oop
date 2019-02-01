package com.bdg.ekirakosyan.Employee;

public class Employee {
    int id;
    int salary;
    String firstName;
    String lastName;

    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return getFirstName()+" "+getLastName();
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnualSalary(){
        return 12*getSalary();
    }
    public int raiseSalary(int percent){
        int risedSalary = (int)(getSalary()*(percent/100.0f));
        return getSalary()+risedSalary;
    }

    @Override
    public String toString() {
        return "Employee[ID: "+getId()+", Name: "+getName()+"; Salary: "+getSalary();
    }
}
