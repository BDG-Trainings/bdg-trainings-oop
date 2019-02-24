package com.bdg.resourcemanagement.hhertevtsyan;

public class Employee {
    private SalaryDetail salaryDetail;
    private Person person;

    public Employee (final Person person, final SalaryDetail salaryDetail) {
        this.person = person;
        this.salaryDetail = salaryDetail;
    }

    public SalaryDetail getSalaryDetail() {
        return salaryDetail;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salaryDetail=" + salaryDetail +
                ", person=" + person +
                '}';
    }

}
