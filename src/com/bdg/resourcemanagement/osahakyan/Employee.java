package com.bdg.resourcemanagement.osahakyan;

public final class Employee {

    private final Person person;
    private final SalaryDetail salaryDetail;

    public Employee(final Person person, final SalaryDetail salaryDetail){
        this.person = person;
        this.salaryDetail = salaryDetail;
    }

    public SalaryDetail getSalaryDetail(){return salaryDetail;}

    public Person getPerson(){return person;}

    @Override
    public String toString(){
        return "Employee (" +
                "salaryDetail: " + salaryDetail +
                ", person: " + person +
                ")";
    }

}
