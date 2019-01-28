package akarapetyan.resource_management;

public class ResourceManagement {

    private Department departments [];

    public ResourceManagement (Department departments []){
        this.departments = departments;
    }

    public void addEmployeeToDepartment (Employee emp, String departmentName){



    }


    public void AddDepartment (Department department) {

        Department [] upd_department = new Department[departments.length+1];

        for (int i =0; i < departments.length; i++){
            upd_department[i] = departments [i];
        }
        upd_department [departments.length] = department;
    }

    public void PrintListOfDepartments() {
        System.out.print("Departments: " );

        for (int i = 0; i < departments.length; i++)
        {
            System.out.print(departments[i] + ", ");
        }
    }
}
