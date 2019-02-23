package com.bdg.agalayan.Lessons_09;


import com.bdg.agalayan.bas.Country;

public class ResourceManagement {
    private Department[]departments;

    public void addEmployeetoDepartment(Employee emp, String departmentName){
        Department dep=findDepartmentByName(departmentName);

    }
    public Employee findEmployeebyName(String employeeName){
        for(int i = 0; i < departments.length; i++) {
            Employee[] emp = departments[i].getEmployees();
            for (int j = 0; j < emp.length; j++) {
                if (emp[j].getPerson().getFirstName() == employeeName) {
                    return emp[j];
                }
            }
        }return  null;
    }

    public Department findDepartmentByName(String departmentName){
        for(int i = 0; i < departments.length; i++){
            if (departments[i].getDepartmentName()==departmentName){
                return departments[i];
            }
        }
        return null;
    }

    public Department getDepartmentwihtMaxSalary(){
        Department department= departments[0];
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
    public static void main(String[]args){
        ResourceManagement resourceMenegment= new ResourceManagement();
        Address addresses=new Address(Country.AM, "Qaxaq1", "Poxoc1", "653241");
        Address addresses1=new Address(Country.AM, "Qaxaq2", "Poxoc2", "653212");
        Address[]a1= {addresses};
        Address []a2={addresses1};
        Person person= new Person("Anun1", "Azganun1", 22, a1);
        Person person1= new Person("Anun2", "Azganun2", 23, a2);






    }

}

