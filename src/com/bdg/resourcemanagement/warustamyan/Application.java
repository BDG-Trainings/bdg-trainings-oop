package com.bdg.resourcemanagement.warustamyan;

import com.bdg.resourcemanagement.warustamyan.service.DepartmentService;
import com.bdg.resourcemanagement.warustamyan.service.EmployeeService;

public class Application {

    public static void main(String[] args) {
        DepartmentService departmentService = new DepartmentService();
        EmployeeService employeeService = new EmployeeService();


        ResourceManagement resourceManagement = new ResourceManagement(10);

        Address address_1 = new Address(Country.AM, "0123456", "street");
        Address address_2 = new Address(Country.RU, "0123456", "street");
        Address[] addresses = {address_1, address_2};

        Person person = new Person("first name", "last name", "middle name", (short) 10, addresses);
        SalaryDetail salaryDetail = new SalaryDetail(10000);
        Employee departmentHead = employeeService.create(person, salaryDetail);

        Address addressEmp_1 = new Address(Country.RU, "0123456", "street");
        Address[] addressesEmp_1 = {addressEmp_1};
        Person personEmp_1 = new Person("first name", "last name", "middle name", (short) 45, addressesEmp_1);
        SalaryDetail salaryDetail_1 = new SalaryDetail(10000);
        Employee employee_1 = employeeService.create(personEmp_1, salaryDetail_1);

        Address addressEmp_2 = new Address(Country.RU, "0123456", "street");
        Address[] addressesEmp_2 = {addressEmp_2};
        Person personEmp_2 = new Person("first name", "last name", "middle name", (short) 45, addressesEmp_2);
        SalaryDetail salaryDetail_2 = new SalaryDetail(10000);
        Employee employee_2 = employeeService.create(personEmp_2, salaryDetail_2);


        Employee[] employees = {employee_1, employee_2};


        Department department = departmentService.create("department name", DepartmentType.Accounting, departmentHead, employees);

        resourceManagement.addDepartment(department);
    }
}
