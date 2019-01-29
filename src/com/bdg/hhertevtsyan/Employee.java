package com.bdg.hhertevtsyan;

public class Employee {
    private double salary;
    private Person person;
    private Department department;

    public Employee (final double salary, final Person person, final Department department) {
        this.salary = salary;
        this.person = person;
        this.department = department;
    }

    public Department getDepartment() { return department;}

    public Person getPerson() { return person;}

    public double getSalary() { return salary;}

    public void setDepartment(Department department) { this.department = department;}

    public void setPerson(Person person) { this.person = person;}

    public void setSalary(double salary) { this.salary = salary;}

    @Override
    public String toString () {
        return "Employee [Depatment = " + department.getDepartmentName() + ", Full name = " + person.getFullName() + ", salary = " + salary +"]";
    }
}
