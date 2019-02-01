package com.bdg.ekirakosyan.Employee;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(133, 500, "John", "Doe");

        System.out.println(emp.toString());
        System.out.println("Anual Salary: " + emp.getAnualSalary());
        System.out.println("Raised Salary: " + emp.raiseSalary(10));
    }
}
