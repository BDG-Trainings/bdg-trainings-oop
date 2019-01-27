package Lessons_09;

public class Department {
    private String departmentName;
    private Employee[] employees;
    private Employee departmentHeadEmplaoyee;
    private double departmentSalary;

    public Department(String departmentName, Employee [] employees, Employee departmentHeadEmplaoyee,
                      double departmentSalary){
        this.departmentName = departmentName;
        this.employees= employees;
        this.departmentHeadEmplaoyee = departmentHeadEmplaoyee;
        this.departmentSalary=departmentSalary;
    }
    public String getDepartmentName() {
        return departmentName;
    }

    public Employee [] getEmployees() {
        return employees;
    }

    public Employee getDepartmentHeadEmployee() {
        return departmentHeadEmplaoyee;
    }

    public double getDepartmentSalary() {
        return departmentSalary;
    }

    public void setDepartmentName(String departamentName) {
        this.departmentName = departamentName;
    }

    public void setEmployees(Employee[]employees) {
        this.employees = employees;
    }

    public void setDepartmentHeadEmplaoyee(Employee departamentHeadEmplaoyee) {
        this.departmentHeadEmplaoyee = departmentHeadEmplaoyee;
    }

    public void setDepartmentSalary(double departamentSalary) {
        this.departmentSalary = departmentSalary;
    }
}
