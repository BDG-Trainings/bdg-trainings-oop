package com.bdg.resourcemanagement.vqertikyan;

public class Employee {
    private Person person;
    private SalaryDetail salaryDetail;

    public Employee(final Person person, final SalaryDetail salaryDetail){
        this.person = person;
        this.salaryDetail = salaryDetail;
    }

    public Person getPerson() {
        return person;
    }

    public SalaryDetail getSalaryDetail() {
        return salaryDetail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person=" + person +
                ", salaryDetail=" + salaryDetail +
                '}';
    }
}
