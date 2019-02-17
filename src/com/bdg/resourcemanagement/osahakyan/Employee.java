package com.bdg.resourcemanagement.osahakyan;

public class Employee {

    private SalaryDetail salaryDetail;
    private Person person;

    public Employee(SalaryDetail salaryDetail, Person person){
        this.salaryDetail = salaryDetail;
        this.person = person;
    }

    public Employee(SalaryDetail salaryDetail, com.bdg.resourcemanagement.warustamyan.Person person) {
    }

    public SalaryDetail getSalaryDetail(){return salaryDetail;}
    public Person getPerson(){return person;}

    @Override
    public String toString(){
        return "Employee {" +
                "salaryDetail =" + salaryDetail +
                ", person =" + person +
                "}";
    }

}
