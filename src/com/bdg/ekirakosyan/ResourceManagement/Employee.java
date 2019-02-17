package ResourceManagement;

public class Employee {

    private double salary;
    private Person person;
    private Department department;

    public Employee(double salary, Person person, Department department) {
        this.salary = salary;
        this.person = person;
        this.department = department;
    }

    public Employee(double salary, Person person){
        this.salary = salary;
        this.person = person;
    }

    public double getSalary() {
        return salary;
    }

    public Person getPerson() {
        return person;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        String employeeInfo = "Person: "+ getPerson() + ", Salary: "+getSalary();
        return employeeInfo;
    }

    public String getEmployeeFullName(){
        return getPerson().getFirstName()+" "+getPerson().getLastName();
    }
}
