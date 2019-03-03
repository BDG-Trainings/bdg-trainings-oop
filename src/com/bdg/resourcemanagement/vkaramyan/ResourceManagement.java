package com.bdg.resourcemanagement.vkaramyan;

public class ResourceManagement {

    private Department[] departments;
    private int currentIndex;

    public ResourceManagement(final int departmentSize) {
        this.departments = new Department[departmentSize];
    }

    public boolean addDepartment(final Department department) {
        if (currentIndex < this.departments.length) {
            this.departments[currentIndex] = department;
            currentIndex++;
            return true;
        }

        System.out.println("Departments is full");
        return false;
    }

    //Wrong method
    public void removeEmployeeFromDepartment(final Employee employee, final String departmentName) {

        /*for (Department department : departments) {
            if (department.getDepartmentName() == departmentName) {
                for (Employee employees : department.getEmployees()) {
                    if (employees.getPerson().getFirstName() == employee.getPerson().getFirstName() && employee
                            .getSalaryDetail().getSalaryAmount() == employee.getSalaryDetail().getSalaryAmount()) {
                        employees = null;
                    }

                    System.out.println("Employee is removed");
                }
            }
        }*/
        int removableEmployeeIndex = -1;
        Department foundDepartment = null;
        for (final Department department : this.departments) {
            if (department.getDepartmentName().equals(departmentName)) {
                for (int i = 0; i < department.getEmployees().length; i++) {
                    if (department.getEmployees()[i].getPerson().getFirstName().equals(employee.getPerson().getFirstName()) && employee
                            .getSalaryDetail().getSalaryAmount() == employee.getSalaryDetail().getSalaryAmount()) {
                        foundDepartment = department;
                        removableEmployeeIndex = i;
                    }
                }
            }
        }

        if (removableEmployeeIndex > 0) {
            Employee[] employees = new Employee[foundDepartment.getEmployees().length - 1];
            int k = 0;
            for (int i = 0; i < foundDepartment.getEmployees().length; i++) {
                if (i != removableEmployeeIndex) {
                    employees[k] = foundDepartment.getEmployees()[i];
                    k++;
                }
            }
            foundDepartment.setEmployees(employees);
        }
    }


    //Same here nned to pass just employee name
    public Employee findEmployeeByName(SalaryDetail salaryDetail, Person person) {
        for (Department department : departments) {
            for (Employee employees : department.getEmployees()) {
                if (employees.getPerson() == person && employees.getSalaryDetail() == salaryDetail) {
                    return employees;
                }
            }
        }

        return null;

    }


    //Please check this method
    public Employee findEmployeeByName(final String employeeName) {
        for (final Department department : this.departments) {
            for (final Employee employee : department.getEmployees()) {
                if (employee.getPerson().getFirstName().equals(employeeName)) {
                    return employee;
                }
            }
        }
        return null;
    }


    //I think department type is unusable in this method we just need to pass department name to this method according method name
    public Department findDepartmentByName(final String departmentName, final Employee departmentHead,
                                           final Employee[] employees, final DepartmentType departmentType) {
        for (Department department : departments) {
            if (department.getDepartmentName() == departmentName && department.getDepartmentType() == departmentType) {
                return department;
            }
        }
        return null;
    }

    //Please checkout this method
    public Department findDepartmentByName(final String departmentName) {
        for (final Department department : this.departments) {
            if (department.getDepartmentName().equals(departmentName)) {
                return department;
            }
        }
        return null;
    }


    //Not a meaningful method name
    public Department findDepartmentWithMaxSalary() {

        double max = 0;
        Department maxSalaryDepartment = null;
        for (final Department department : this.departments) {
            double tampMaxSalary = 0.0;
            for (final Employee employee : department.getEmployees()) {
                tampMaxSalary = tampMaxSalary + employee.getSalaryDetail().getSalaryAmount();
            }
            //We need include department head salary to
            tampMaxSalary = tampMaxSalary + department.getDepartmentHead().getSalaryDetail().getSalaryAmount();
            if (tampMaxSalary > max) {
                max = tampMaxSalary;
                maxSalaryDepartment = department;
            }
        }
        return maxSalaryDepartment;
    }
}
