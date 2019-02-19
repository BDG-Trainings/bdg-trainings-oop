package com.bdg.resourcemanagement.aghazaryan;

public class Employee {

    private SalaryDetail  salaryDetail;
    private Person person;
    private Department department;

    public Employee(SalaryDetail salaryDetail, Person person) {
        this.salaryDetail = salaryDetail;
        this.person = person;
        this.department = department;
    }

    public SalaryDetail getSalaryDetail() {
        return salaryDetail;
    }

    public Person getPerson()
    {
        return person;
    }

    public Department getDepartment (){
        return department;
    }
}


