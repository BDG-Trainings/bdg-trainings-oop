package com.bdg.resourcemanagement.spapoyan;

public class Application {
    public static void main(String[] args) {
        ResourceManagement resourceManagement = new ResourceManagement(2);

        Address address1 = new Address(Country.AM, "777777", "Street1");
        Address address2 = new Address(Country.US, "888888", "Street2");
        Address address3 = new Address(Country.SG, "999999", "Street3");

        Address[] addresses1 = {address1, address2, address3};
        Address[] addresses2 = {address1, address2};
        Address[] addresses3 = {address1};

        Person person1 = new Person("fname1", "lname1","mname1",(short)30, addresses1);
        Person person2 = new Person("fname2", "lname2","mname2",(short)31, addresses2);
        Person person3 = new Person("fname3", "lname3","mname3",(short)32, addresses3);

        SalaryDetail salaryDetail01  = new SalaryDetail(500.000,"0000-0000-0000-0000");
        SalaryDetail salaryDetail02 = new SalaryDetail(400.000,"1111-1111-1111-1111");
        SalaryDetail salaryDetail03 = new SalaryDetail(300.000,"2222-2222-2222-2222");

        Employee employee1 = new Employee(person1,salaryDetail01);
        Employee employee2 = new Employee(person2,salaryDetail02);
        Employee employee3 = new Employee(person3,salaryDetail03);

        Employee[] employees01 = {employee1, employee2, employee3};
        Employee[] employees02 = {employee1, employee2};
        Employee[] employees03 = {employee1};

        Department department1 = new Department(DepartmentType.CEO,"dname1",employee1,employees01);
        Department department2 = new Department(DepartmentType.Engineering,"dname2",employee2,employees02);
        Department department3 = new Department(DepartmentType.Sales,"dname3",employee3,employees03);

        resourceManagement.addDepartment(department1);
        resourceManagement.addDepartment(department2);
        resourceManagement.addDepartment(department3);

    }
}
