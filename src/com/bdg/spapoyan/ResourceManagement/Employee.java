package com.bdg.spapoyan.ResourceManagement;


public class Employee {
    private double salary;
    private Person person;
    private Department department;

    public Employee (final double salary, final Person person, final Department department) {
        this.salary = salary;
        this.person = person;
        this.department = department;

    }

    public double getSalary() {
        return salary;
    }

    public Person getPerson() {
        return person;
    }

    public Department getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", person=" + person +
                ", department=" + department +
                '}';
    }
}
