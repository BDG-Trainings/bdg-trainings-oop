package com.bdg.resourcemanagement.vkaramyan;

public class Application {
	
	public static void main(String[] args) {
		
		Address address1 = new Address(Country.AM,"Street 1", "0232313" );
        Address address2 = new Address(Country.AM,"Street 2", "5464646" );
        Address address3 = new Address(Country.AM,"Street 3", "9968965" );

        Address[] addressArr1 = {address1, address2, address3};
        Address[] addressArr2 = {address1, address2};
        Address[] addressArr3 = {address3};

        Person person1 = new Person("FName1", "LName1", "MName1", (short) 28, addressArr1);
        Person person2 = new Person("FName2", "LName2", "MName2", (short) 35, addressArr2);
        Person person3 = new Person("FName3", "LName3", "MName3", (short) 18, addressArr3);

        SalaryDetail salaryDetail = new SalaryDetail(125.300, "121212121");
        SalaryDetail salaryDetai2 = new SalaryDetail(456.007, "786786786");
        SalaryDetail salaryDetai3 = new SalaryDetail(345.500, "353453534");

        Employee employee1 = new Employee(salaryDetail, person1);
        Employee employee2 = new Employee(salaryDetai2, person2);
        Employee employee3 = new Employee(salaryDetai3, person3);

        Employee[] empArr1 = {employee1, employee2, employee3};
        Employee[] empArr2 = {employee2, employee3};


        Department dep1 = new Department("Dep1", employee1, empArr1, DepartmentType.ENGINEERING);
        Department dep2 = new Department("Dep2", employee3, empArr2, DepartmentType.ACCOUNTING);
        Department dep3 = new Department("Dep3", employee3, empArr2, DepartmentType.MARKETING);

        ResourceManagement resourceManagement = new ResourceManagement(2);

        resourceManagement.addDepartment(dep1);
        resourceManagement.addDepartment(dep2);
        resourceManagement.addDepartment(dep3);

		
	}

}
