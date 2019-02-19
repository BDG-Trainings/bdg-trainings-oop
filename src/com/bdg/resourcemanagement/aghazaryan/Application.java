package com.bdg.resourcemanagement.aghazaryan;

public class Application {

    public static void main(String[] args) {

        Address address1 = new Address(Country.AM, "Street 1", "0232313");
        Address address2 = new Address(Country.RU, "Street 2", "5464646");
        Address address3 = new Address(Country.US, "Street 3", "9968965");

        Address[] addressArr1 = {address1, address2, address3};
        Address[] addressArr2 = {address1, address2};
        Address[] addressArr3 = {address3};

        Person person1 = new Person("FName1", "LName1", "MName1", 28, addressArr1);
        Person person2 = new Person("FName2", "LName2", "MName2", 35, addressArr2);
        Person person3 = new Person("FName3", "LName3", "MName3", 18, addressArr3);

        SalaryDetail salaryDetail = new SalaryDetail(125.300, "121212121");
        SalaryDetail salaryDetai2 = new SalaryDetail(456.007, "786786786");
        SalaryDetail salaryDetai3 = new SalaryDetail(345.500, "353453534");

        Employee employee1 = new Employee(salaryDetail, person1);
        Employee employee2 = new Employee(salaryDetai2, person2);
        Employee employee3 = new Employee(salaryDetai3, person3);

        Employee[] empArr1 = {employee1, employee2, employee3};
        Employee[] empArr2 = {employee2, employee3};


        Department dep1 = new Department(DepartmentType.ENGINEERING, "Developers", employee1, empArr1);
        Department dep2 = new Department(DepartmentType.ACCOUNTING, "Payroll", employee3, empArr2);
        Department dep3 = new Department(DepartmentType.MARKETING, "SMM", employee3, empArr2);

        ResourceManagement resourceManagement = new ResourceManagement(2);

        resourceManagement.addDepartment(dep1);
        resourceManagement.addDepartment(dep2);
        resourceManagement.addDepartment(dep3);

    }

}