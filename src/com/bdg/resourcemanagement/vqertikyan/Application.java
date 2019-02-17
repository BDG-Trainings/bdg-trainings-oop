package com.bdg.resourcemanagement.vqertikyan;

import com.bdg.resourcemanagement.vqertikyan.service.DepartmentService;
import com.bdg.resourcemanagement.vqertikyan.service.EmployeeService;

public class Application {
    public static void main(String[] args) {

        ResourceManagement management = new ResourceManagement(10);

        Address[] addresses = new Address[2];
        addresses[0] = new Address(Country.AM, "street1", "phone1");
        addresses[1] = new Address(Country.AM, "street2", "phone2");

        Person person1 = new Person("firstName1", "lastName1", "middleName1", (short) 70, addresses);
        Person person2 = new Person("firstName2", "lastName2", "middleName2", (short) 10, addresses);
        Person person3 = new Person("firstName3", "lastName3", "middleName3", (short) 100, addresses);

        SalaryDetail salaryDetail1 = new SalaryDetail(50000);
        SalaryDetail salaryDetail2 = new SalaryDetail(50000, "44548754");

        EmployeeService employeeService = new EmployeeService();
        Employee[] employees = new Employee[2];
        employees[0] = employeeService.create(person1, salaryDetail1);
        employees[1] = employeeService.create(person2, salaryDetail2);

        DepartmentService departmentService = new DepartmentService();
        Department department1 = departmentService.create(DepartmentType.Engineering, "Dep1", employeeService.create(person3, salaryDetail2), employees);

        management.addDepartment(department1);

    }
}
