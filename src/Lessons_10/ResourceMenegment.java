package Lessons_10;


import com.bdg.agalayan.Lessons_09.Address;
import com.bdg.agalayan.Lessons_09.Department;
import com.bdg.agalayan.Lessons_09.Employee;
import com.bdg.agalayan.Lessons_09.Person;

public class ResourceMenegment {

    private Department[]departments;

    public void addEmployeetoDepartment(Employee emp, String departmentName){
         Department dep=findDepartmantbyName(departmentName);

             }
    public Employee findEmployeebyName(String employeeName){
       for(int i = 0; i < departments.length; i++) {
           Employee[] emp = departments[i].getEmployees();
           for (int j = 0; j < emp.length; j++) {
               if (emp[j].getPerson().getFirstName() == employeeName) {
                   return emp[j];               }
           }
       }return  null;    }
    public Department findDepartmantbyName(String depatrmentName){
        for(int i = 0; i < departments.length; i++){
            if (departments[i].getDepartmentName()==depatrmentName){
                return departments[i];
            }        }
        return null;    }
    public Department getDepartmentwihtMaxSalary(){
        Department department=departments[0];
        double maxSalary=0;
        maxSalary= departments[0].getDepartmentBudget();
        for(int i = 0; i < departments.length; i++){
            if(departments[i].getDepartmentBudget()>maxSalary){
                maxSalary=departments[i].getDepartmentBudget();
                department=departments[i];
            }
        }return department;
    }
    public void removeEmployeefromDepartment(Employee emp,String DepartmentName) {
        int index=-1;
        for(int i =0; i<departments[i].getEmployees().length; i++){
            if(departments[i].getEmployees()[i]==emp){
                index=i;
            }
        }if(index==-1) {
            Employee[] e = new Employee[departments.length - 1];
            for (int i = 0; i < departments[i].getEmployees().length; i++) {
                if (departments[i].getEmployees()[i] != emp) {
                    e[i] = departments[i].getEmployees()[i];
                }
                this.departments[i].getEmployees();
            }

        }
    }
    public static void main(String[]args){
        ResourceMenegment resourceMenegment= new ResourceMenegment();
        Address []addresses=new Address[1];
        addresses[0]= new Address("Street1", "State1", "City1", "212121");
        Person person= new Person("Anun1", "Azganun1", "Hayranun1", 22, addresses);
       // Department department= new Department("Dep1", )
        //Employee employee= new Employee(200000, person, )
    }

}
