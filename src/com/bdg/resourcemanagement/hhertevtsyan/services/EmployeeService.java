package com.bdg.resourcemanagement.hhertevtsyan.services;

import com.bdg.resourcemanagement.hhertevtsyan.Employee;
import com.bdg.resourcemanagement.hhertevtsyan.Person;
import com.bdg.resourcemanagement.hhertevtsyan.SalaryDetail;

public class EmployeeService {

    public Employee create(final Person person, final SalaryDetail salaryDetail) {
        Employee employee = new Employee(person, salaryDetail);
        return employee;
    }
}