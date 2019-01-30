package com.bdg.vqertikyan.resourcemanagement;

public class MainResourceManagement {

    public static void main(String[] args) {
        Address[] addresses = new Address[1];
        addresses[0] = new Address("street1", "city1", "state1", "zipCode1");

        Person person = new Person("name", "firstName", "middleName", (short) 25, addresses);

        Employee newEmp = new Employee(1000, person);


        Department[] departments = new Department[5];
        departments[0] = new Department("dep1", null, null, 4000);
        departments[1] = new Department("dep2", null, null, 3000);
        departments[2] = new Department("department", null, null, 5000);
        departments[3] = new Department("dep4", null, null, 1000);
        departments[4] = new Department("dep5", null, null, 2000);

//        ResourceManagement resourceManagement = new ResourceManagement(departments);
        ResourceManagement resourceManagement = new ResourceManagement();
//        resourceManagement.setDepartments(departments);
        String depName = "department";
        Department dep3 = resourceManagement.findDepartmentByName(depName);

        if (dep3 != null) {
            System.out.println(dep3.getDepartmentName());
        } else {
            System.out.println("Department with name : " + depName + " not found !!!");
        }
        resourceManagement.getDepartmentWithMaxSalary();
    }
}
