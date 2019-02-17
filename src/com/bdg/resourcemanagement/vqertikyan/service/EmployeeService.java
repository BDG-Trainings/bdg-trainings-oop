package com.bdg.resourcemanagement.vqertikyan.service;

import com.bdg.resourcemanagement.vqertikyan.Employee;
import com.bdg.resourcemanagement.vqertikyan.Person;
import com.bdg.resourcemanagement.vqertikyan.SalaryDetail;

public class EmployeeService {

    public Employee create(final Person person, final SalaryDetail salaryDetail){
        return new Employee(person, salaryDetail);
    }
}
