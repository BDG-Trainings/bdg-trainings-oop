package aiskandaryan.Lesson_09;

public class Employee {
    private double salary;
    private Person person;
    private Department department;

    public Employee(final double salary,final Person person,final Department department) {
        this.salary = salary;
        this.person = person;
        this.department = department;
    }

    public void setPerson(final Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(final Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        String depName = department == null? "NO DEPARTMENT" : department.getDepartmentName();
        return "Employee[personFirstName=" + person.getFirstName()
                        + ", personLastName=" + person.getLastName()
                        + ", DepartmentName=" + depName
                        + ", salary=" + salary + "]";
    }
}
