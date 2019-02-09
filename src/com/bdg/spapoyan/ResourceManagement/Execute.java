package com.bdg.spapoyan.ResourceManagement;

public class Execute {
    public static void main(String[] args) {
        Address Address01 = new Address("Փողոց", "Քաղաք", "Պետություն", "ինդեքս");
        Address Address02 = new Address("Փողոց", "Քաղաք", "Պետություն", "ինդեքս");
        Address Address03 = new Address("Փողոց", "Քաղաք", "Պետություն", "ինդեքս");

        Address[] addresses = new Address[3];
        addresses[0] = Address01;
        addresses[1] = Address02;
        addresses[2] = Address03;

        Person Person01 = new Person("Անուն", "Ազգանուն", "Հայրանուն", (short) 31, addresses);
            System.out.println(Person01.toString());

        Employee employee1 = new Employee(1000,Person01,null);
        Employee employee2 = new Employee(1000,Person01,null);
        Employee employee3 = new Employee(1000,Person01,null);
            Employee[]employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        Department department = new Department("Department",null,employee3,2000);


        employee1 = new Employee(1000,Person01,department);
        employee2 = new Employee(1000,Person01,department);
        employee3 = new Employee(1000,Person01,department);

        System.out.println(department.toString());

    }
}
