package com.bdg.akarapetyan.resourcemanagement;

public class Executor {

    public static void main(String[] args) {

        Address add0 = new Address("Moscovyan", "Los Angeles", "California", "0009");
        Address add1 = new Address("Baghramyan", "Yerevan", "Yerevan", "0009");
        Address add2 = new Address("Saryan", "Yerevan", "Yerevan", "0009");

        Address [] add = new Address [3];
        add [0] = add0;
        add [1] = add1;
        add [2] = add2;
        Address [] addresses1 = new Address [1];
        addresses1 [0] = add0;

        Person person1 = new Person("Angelina", "Jolie", "Voight", (short)43, add);
        //System.out.println(person1.toString());
        Employee employee1 = new Employee(1000, person1);
        //System.out.println(employee1.toString());
        //System.out.println();
        Person person2 = new Person("Jennifer", "Aniston", "Joanna", (short)25, add);
        //System.out.println(person2.toString());
        Employee employee2 = new Employee(700, person2);
        //System.out.println(employee2.toString());

        Employee [] employee = new Employee[2];
        employee [0] = employee1;
        employee [1] = employee2;

        Department department = new Department("Accounting", employee, employee1, employee1.getSalary()+employee2.getSalary() );
        System.out.println(department.toString());


    }
}
