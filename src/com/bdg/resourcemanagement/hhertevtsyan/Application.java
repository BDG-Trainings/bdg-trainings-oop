package com.bdg.resourcemanagement.hhertevtsyan;

import com.bdg.resourcemanagement.hhertevtsyan.enums.CountryEnum;
import com.bdg.resourcemanagement.hhertevtsyan.enums.SalaryType;
import com.bdg.resourcemanagement.hhertevtsyan.services.EmployeeService;
import com.bdg.resourcemanagement.hhertevtsyan.enums.DepartmentType;
import com.bdg.resourcemanagement.hhertevtsyan.services.DepartmentService;

public class Application {
    public static void main(String[] args) {

        DepartmentService departmentService = new DepartmentService();
        EmployeeService employeeService = new EmployeeService();
        ResourceManagement resourceManagement = new ResourceManagement(10);

        Address address1 = new Address(CountryEnum.AM, "Nazarbekyan 5", "+37491377576");
        Address address2 = new Address(CountryEnum.RU, "Nazarbekov 15", "+37491065175");
        Address [] person1addresses = {address1, address2};

        Person person1 = new Person("Petros", "Petrosyan", "Petrosi", (short) 30, person1addresses);
        SalaryDetail headSalaryDetail = new SalaryDetail(370000);
        Employee departmentHead = employeeService.create(person1, headSalaryDetail);

        SalaryDetail engineerSalaryDetail = new SalaryDetail(5000000, "9954 1235 1445 7448");
        Address person2Address = new Address(CountryEnum.IT, "Fuimincino 3", "+3245745687454");
        Address [] person2Addresses = {person2Address};
        Person person2 = new Person("Poghos", "Poghosyan", "Poghosi", (short) 28, person2Addresses);
        Employee emp1 = employeeService.create(person2, engineerSalaryDetail);
        Employee [] employees = {emp1};

        Department department = departmentService.create(DepartmentType.Engineering, "Developers", departmentHead, employees);
    }
}
