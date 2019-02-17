package com.bdg.resourcemanagement.spapoyan;

public class Employee {

    private Person person;
    private SalaryDetail salary;


    public Employee(final Person person, final SalaryDetail salary) {
        this.person = person;
        this.salary = salary;
    }

    public Person getPerson() {
        return person;
    }

    public SalaryDetail getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person=" + person +
                ", salary=" + salary +
                '}';
    }
}
