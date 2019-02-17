package com.bdg.resourcemanagement.vkaramyan.service;

import com.bdg.resourcemanagement.vkaramyan.Employee;
import com.bdg.resourcemanagement.vkaramyan.Person;
import com.bdg.resourcemanagement.vkaramyan.SalaryDetail;

//constructori anhrajeshtutyun chka qani vor ogtagorcelu enq service-i create methody vory stanaluya parameternery new ani u het veradarcni

public class EmployeeService {
	
	public Employee create(final Person person, final SalaryDetail salaryDetail){
        Employee employee = new Employee(salaryDetail, person);
        return employee;
        
	}
	
}
