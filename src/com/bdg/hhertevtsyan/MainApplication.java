package com.bdg.hhertevtsyan;

public class MainApplication {
    public static void main(String[] args) {
        Department acc = new Department("Accounting", null, null, 2000000);
        Department hr = new Department("Human Resources", null, null, 1000000);
        Department dev = new Department("Development", null, null, 8000000);
        Department qa = new Department("Quality Assurance", null, null, 6000000);

        Person kkarapetyan = new Person("Karen", "Karapetyan", "Kareni", (short)30, null);
        Person ppetrosyan = new Person("Petros", "Petrosyan", "Petrosi", (short) 32, null);
        Person ppoghosyan = new Person("Poghos", "Poghosyan", "Phoghosi", (short)37, null);
        Person amargaryan = new Person("Avag", "Margaryan", "Ashoti", (short) 32, null);
        Person agevorgyan = new Person("Artak", "Gevorgyan", "Kareni", (short)29, null);
        Person aminasyan = new Person("Ani", "Minasyan", "Vazgeni", (short) 32, null);
        Person santonyan = new Person("Sergey", "Antonyan", "Vladimiri", (short)30, null);
        Person amesropyan = new Person("Aida", "Mesropyan", "Tigrani", (short) 33, null);
        Person amakarpyan = new Person("Aida", "Makaryan", "Tigrani", (short) 33, null);

        Employee accHead = new Employee(300000, kkarapetyan, acc);
        Employee hrHead = new Employee(205000, aminasyan, hr);
        Employee devHead = new Employee(500000, agevorgyan, dev);
        Employee qaHead = new Employee(350000, santonyan, qa);
        Employee hrSpecialist = new Employee(200000, amesropyan, hr);
        Employee leadDeveloper = new Employee(400000, ppetrosyan, dev);
        Employee developer = new Employee(300000, ppoghosyan, dev);
        Employee qaSpecialist = new Employee(280000, amargaryan, qa);
        Employee accSpecialist = new Employee(150000, amakarpyan, null);

        hr.setDepartmentHeadEmployee(hrHead);
        acc.setDepartmentHeadEmployee(accHead);
        dev.setDepartmentHeadEmployee(devHead);
        qa.setDepartmentHeadEmployee(accHead);
      //  System.out.println(hr.getEmployees().toString());

        Department [] departments = new Department[4];
        departments[0] = acc;
        departments[1] = hr;
        departments[2] = dev;
        departments[3] = qa;

        ResourceManagement JavaProgrammingCompany = new ResourceManagement (departments);

        JavaProgrammingCompany.addEmployeeToDepartment(accSpecialist,"Development");
        //String searchResult = JavaProgrammingCompany.findEmployeeByName("Avag Margaryan Ashoti").toString();
        System.out.println("searchResult");
    }

}
