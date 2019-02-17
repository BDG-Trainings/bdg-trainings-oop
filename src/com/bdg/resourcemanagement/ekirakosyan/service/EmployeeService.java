package com.bdg.resourcemanagement.ekirakosyan.service;

import com.bdg.resourcemanagement.ekirakosyan.Employee;
import com.bdg.resourcemanagement.ekirakosyan.Person;
import com.bdg.resourcemanagement.ekirakosyan.SalaryDetail;

public class EmployeeService {

    private SalaryDetail salaryDetail;
    private Person person;

    public EmployeeService(SalaryDetail salaryDetail, Person person) {
        this.salaryDetail = salaryDetail;
        this.person = person;
    }

    public Employee create(SalaryDetail salaryDetail, Person person){
        Employee employee = new Employee(salaryDetail, person);
        return employee;
    }

}
