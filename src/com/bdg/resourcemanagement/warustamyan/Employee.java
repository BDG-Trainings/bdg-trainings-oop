package com.bdg.resourcemanagement.warustamyan;

public final class Employee {

    private final SalaryDetail salaryDetail;
    private final Person person;

    public Employee(final Person person, final SalaryDetail salaryDetail) {
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
