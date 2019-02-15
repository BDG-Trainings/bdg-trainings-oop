package Lessons_10;

import Lessons_09.Department;
import Lessons_09.Employee;
import Lessons_09.Person;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ResourceMenegment {

    private Department []departments;

    public void addEmployeetoDepartment(Employee emp, String departmentName){
         Department dep=findDepartmantbyName(departmentName);
         dep.setEmployees(emp);
             }
    public  Employee  findEmployeebyName(String employeeName){
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
        maxSalary= departments[0].getDepartmentSalary();
        for(int i = 0; i < departments.length; i++){
            if(departments[i].getDepartmentSalary()>maxSalary){
                maxSalary=departments[i].getDepartmentSalary();
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

}
