package aiskandaryan.Lesson_09;

public class Executor {

    private static Address[] makeAddresses(final int size, final int startFrom) {
        Address [] addresses = new Address[size];
        for (int i = 0; i < addresses.length; i++) {
            int extension = i + startFrom;
            addresses[i] = new Address("State_" + extension, "City_" + extension, "Street_" + extension, "Zip_" + extension);
        }
        return addresses;
    }

    public static void main(String[] args) {
        Address [] addresses1 = makeAddresses(5, 0);
        Address [] addresses2 = makeAddresses(3, 5);
        Address [] addresses3 = makeAddresses(2, 8);
        Address [] addresses4 = makeAddresses(1, 10);
        Person person1 = new Person("FirstName1", "LastName1", "MiddleName1", (short)20, addresses1);
        Person person2 = new Person("FirstName2", "LastName2", "MiddleName2", (short)30, addresses2);
        Person person3 = new Person("FirstName3", "LastName3", "MiddleName3", (short)35, addresses3);
        Person person4 = new Person("FirstName4", "LastName4", "MiddleName4", (short)45, addresses4);
        Department department1 = new Department("Department1", null, null, 0);
        Department department2 = new Department("Department2", null, null, 0);
        Employee employee1 = new Employee(10000, person1, null);
        Employee employee2 = new Employee(15000, person2, null);
        Employee employee3 = new Employee(20000, person3, null);
        Employee employee4 = new Employee(25000, person4, null);
        System.out.println(employee1);

        department1.addEmployee(employee1);
        System.out.println(employee1);
        department1.addEmployee(employee2);
        department1.addEmployee(employee3);
        department1.setDepartmentHeadEmployee(employee1);
        department2.addEmployee(employee4);
        department2.setDepartmentHeadEmployee(employee4);
    }
}
