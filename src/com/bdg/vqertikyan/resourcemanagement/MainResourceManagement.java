package com.bdg.vqertikyan.resourcemanagement;

public class MainResourceManagement {

    public static void main(String[] args) {
        Address[] addresses = new Address[1];
        addresses[0] = new Address("street1", "city1", "state1", "zipCode1");

        Person person = new Person("name", "firstName", "middleName", (short) 25, addresses);

        Employee newEmp = new Employee(1000, person);

        ResourceManagement resourceManagement = new ResourceManagement();

        Department[] departments = new Department[5];
        departments[0] = new Department("dep1", null, null, 4000);
        departments[1] = new Department("dep2", null, null, 3000);
        departments[2] = new Department("dep3", null, null, 5000);
        departments[3] = new Department("dep4", null, null, 1000);
        departments[4] = new Department("dep5", null, null, 2000);


        resourceManagement.findDepartmentByName("dep3", departments);
        resourceManagement.getDepartmentWithMaxSalary(departments);
    }
}
