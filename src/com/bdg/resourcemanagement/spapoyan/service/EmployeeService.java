package com.bdg.resourcemanagement.spapoyan.service;

import com.bdg.resourcemanagement.spapoyan.Employee;
import com.bdg.resourcemanagement.spapoyan.Person;
import com.bdg.resourcemanagement.spapoyan.SalaryDetail;

public class EmployeeService {

    public Employee create (final Person person, final SalaryDetail salary) {
       Employee employee = new Employee(person, salary);
       return employee;
    }
}

