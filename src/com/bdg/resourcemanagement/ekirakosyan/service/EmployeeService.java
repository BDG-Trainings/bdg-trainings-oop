package com.bdg.resourcemanagement.ekirakosyan.service;

import com.bdg.resourcemanagement.ekirakosyan.Employee;
import com.bdg.resourcemanagement.ekirakosyan.Person;
import com.bdg.resourcemanagement.ekirakosyan.SalaryDetail;

public class EmployeeService {

    public Employee create(SalaryDetail salaryDetail, Person person){
        Employee employee = new Employee(salaryDetail, person);
        return employee;
    }

}
