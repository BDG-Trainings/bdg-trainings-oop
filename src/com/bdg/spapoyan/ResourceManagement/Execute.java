package com.bdg.spapoyan.ResourceManagement;

public class Execute {

    public static void main(String[] args) {

        Address address01 = new Address("փողոց","քաղաք","պետություն","ինդեքս");
        Address address02 = new Address("փողոց","քաղաք","պետություն","ինդեքս");

        Address [] addresses = new Address[2];

        addresses[0] = address01;
        addresses[1] = address02;

        Person person = new Person("անուն","ազգանուն","հայրանուն",(short) 31,addresses);
            System.out.println(person.toString());


        Employee employee01 = new Employee(2000,person,null);
        Employee employee02 = new Employee(1000,person,null);

        Employee[]employees = new Employee[2];
        employees[0] = employee01;
        employees[1] = employee02;

        Department department = new Department("dep",employees,employee01,10000);
            System.out.println(department.toString());
    }
}
