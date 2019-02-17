package com.bdg.resourcemanagement.osahakyan;

import com.bdg.resourcemanagement.osahakyan.Service.DepartmentService;
import com.bdg.resourcemanagement.osahakyan.Service.EmployeeService;

public class Application {

    public static void main(String[] args){

        DepartmentService departmentService = new DepartmentService();
        EmployeeService employeeService = new EmployeeService();

        ResourceManagement resourceManagement = new ResourceManagement( 11);

        Address address_1 = new Address(Country.CN, "street_1", "010-725");
        Address address_2 = new Address(Country.AM, "street_2", "010-726");
        Address address_3 = new Address(Country.ES, "street_3", "010-727");

        Address[] addresses = {address_1, address_2, address_3};

        Person personEmp_1 = new Person("FN", "LN","MN",(short)25,addresses);
        SalaryDetail salaryDetail = new SalaryDetail(300);
        Employee departmentHead = employeeService.create(personEmp_1, salaryDetail);

        Address address_4 = new Address(Country.ES, "street_3", "010-727");
        Address address_5 = new Address(Country.ES, "street_3", "010-727");

        Address[] addresses_ = {address_4, address_5};

        Person personEmp_2 = new Person("FN", "LN", "MN", (short) 25, addresses_);
        SalaryDetail salaryDetail_ = new SalaryDetail(250);
        Employee employee_1 = employeeService.create(personEmp_2, salaryDetail_);


        Employee[] employees = {departmentHead, employee_1};

        Department department = departmentService.create( DepartmentType.ENGINEERING,"Department name", departmentHead, employees);

        resourceManagement.addDepartment(department);
    }
}

