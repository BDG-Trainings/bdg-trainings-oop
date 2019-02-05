package ResourceManagement;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("4916  Richland Avenue", "Spring", "TX", "77388" );
        Address address2 = new Address("4847  Valley Lane", "Austin", "TX", "78701" );
        Address address3 = new Address("2999  Woodbridge Lane", "Detroit", "MI", "48214" );
        Address address4 = new Address("3779  Berkshire Circle", "OSHKOSH", "NE", "69154" );

        String[] addressP1 = {address1.getAddress(), address2.getAddress()};
        String[] addressP2 = {address3.getAddress()};
        String[] addressP3 = {address4.getAddress()};

        Person person1 = new Person("Patrick", "Wolff", "P", 30, addressP1);
        Person person2 = new Person("Barbara", "Yoho", "J", 26, addressP2);
        Person person3 = new Person("Alan", "Paul", "H", 36, addressP3);

        Employee emp1 = new Employee(130, person1);
        Employee emp2 = new Employee(180, person2);
        Employee emp3 = new Employee(250, person3);

        Employee[] employee1={emp1,emp2};
        Employee[] employee2={emp3};


        Department dep1 = new Department("Research and Development", employee1, emp2, 5500);
        Department dep2 = new Department("Human Resource Management", employee2, emp3, 3800);
        Department[] departments = {dep1};

        ResourceManagement rManagement = new ResourceManagement(departments);
        System.out.println("");
        System.out.println("DepartmentInfo");
        System.out.println(rManagement);

        rManagement.addEmployeeToDepartment(emp3, "Research and Development");
        System.out.println("");
        System.out.println("Add Employee To Department");
        System.out.println(rManagement);

        rManagement.addEmployeeToDepartment(emp2, "Research and Development");
        System.out.println("");
        System.out.println("Add Employee To Department");
        System.out.println(rManagement);

        rManagement.findDepartmentByName("Human Resource Management");
        System.out.println("");
        System.out.println("find Department Info By Name");
        System.out.println(rManagement);

        Department[] departments1 = {dep1, dep2};
        ResourceManagement rManagement1 = new ResourceManagement(departments1);
        Department withMaxSalary = rManagement1.getDepartmentWithMaxSalary();
        System.out.println("");
        System.out.println("Department With Max Salary is: ");
        System.out.println(withMaxSalary);

    }
}
