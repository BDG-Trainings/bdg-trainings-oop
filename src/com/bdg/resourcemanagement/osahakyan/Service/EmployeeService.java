package com.bdg.resourcemanagement.osahakyan.Service;

import com.bdg.resourcemanagement.osahakyan.Employee;
import com.bdg.resourcemanagement.osahakyan.Person;
import com.bdg.resourcemanagement.osahakyan.SalaryDetail;

public final class EmployeeService {

    public Employee create(final Person person, final SalaryDetail salaryDetail) {
        return new Employee(person, salaryDetail);
    }
}
