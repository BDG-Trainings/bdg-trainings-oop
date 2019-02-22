package com.bdg.hhertevtsyan.resourcemanagment;

public class ResourceManagement {
    private Department departments[];
    Department department = null;

    public ResourceManagement(Department[] departments) {
        this.departments = departments;
    }

    public Department findDepartmentByName(String departmentName) {

        for (int i = 0; i < departments.length; i = i + 1) {
            if (departments[i].getDepartmentName() == departmentName) {
                department = departments[i];
            }
        }
        return department;
    }

    public Employee findEmployeeByName(String FullName) {

        Employee[] employees = null;
        Employee employee = null;

        for (int i = 0; i < departments.length; i = i + 1) {
            employees = departments[i].getEmployees();
            for (int k = 0; k < employees.length; k = k + 1) {
                if (employees[k].getPerson().getFullName() == FullName) {
                    employee = employees[k];
                }
            }
        }
        return employee;
    }

    public void addEmployeeToDepartment(Employee employee, String departmentName) {

        Department department = findDepartmentByName(departmentName);
        Employee[] employee_new = new Employee[department.getEmployees().length + 1];
        for (int i = 0; i < department.getEmployees().length; i = i + 1) {
            employee_new[i] = department.getEmployees()[i];
        }
        employee_new[department.getEmployees().length] = employee;
        department.setEmployees(employee_new);
    }

    public void removeEmployeeFromDepartment(Employee employee, String departmentName) {

        Department department = findDepartmentByName(departmentName);
        Employee[] employee_new = new Employee[department.getEmployees().length - 1];
        for (int i = 0; i < department.getEmployees().length - 1; i = i + 1) {

            if (employee != department.getEmployees()[i]) {
                employee_new[i] = department.getEmployees()[i];
            }
        }
        department.setEmployees(employee_new);
    }


    public Department getDepartmentWithMaxSalary() {
        Department departmentWithMaxSalary = null;
        for (int i = 0; i < departments.length; i = i + 1) {
            if (departments[i].getDepartmentSalary() > departmentWithMaxSalary.getDepartmentSalary()) {
                departmentWithMaxSalary = departments[i];
            }
        }
        return departmentWithMaxSalary;
    }
}
