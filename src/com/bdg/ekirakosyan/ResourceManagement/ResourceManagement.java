package com.bdg.ekirakosyan.ResourceManagement;

public class  ResourceManagement{
    private Department departments[];

    public ResourceManagement(){

    }

    public ResourceManagement(Department[] departments) {
        this.departments = departments;
    }

    public void addEmployeeToDepartment(Employee employee, String departmentName){
        int depLength = departments.length;
        for (int i = 0; i < depLength ; i++) {
            if(departments[i].getDepartmentName().contentEquals(departmentName)){
                departments[i].addEmployee(employee);
            }
        }
    }
    public void removeEmployeeFromDepartment(Employee employee, String departmentName){
        int depLength = departments.length;
        for (int i = 0; i < depLength ; i++) {
            if(departments[i].getDepartmentName().contentEquals(departmentName)){
                departments[i].removeEmployee(employee);
            }
        }
    }

    public Department findDepartmentByName(String departmentName){
        for (int i = 0; i < departments.length ; i++) {
            if(departments[i].getDepartmentName().contentEquals(departmentName)) {
                return departments[i];
            }
        }
        return null;
    }

    public Department getDepartmentWithMaxSalary(){
        double max = departments[0].getDepartmentSalary();
        for (int i = 0; i < departments.length; i++) {
            System.out.println(departments[i]);
            if (departments[i].getDepartmentSalary()>max){

                max = departments[i].getDepartmentSalary();
            }
        }

        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getDepartmentSalary()==max){
                return departments[i];
            }
        }
        return null;
    }


    @Override
    public String toString() {
        String rmInfo = "";
        for (int i = 0; i < departments.length ; i++) {
            rmInfo += "Department-"+(i+1)+": "+departments[i].getDepartmentName()+"; ";
            rmInfo += departments[i].getEmployeesInfo();
            if(i<departments.length-1){
                rmInfo += "; ";
            }
        }
        return  rmInfo;
    }
}
