package akarapetyan.resource_management;

public class ResourceManagement {

    private Department departments [];

    public ResourceManagement (){


    }

    public void addEmployeeToDepartment (Employee emp, String departmentName){

        for (int i=0; i < departments.length; i++){

            if (departments[i].getDepartmentName() == departmentName)
            {
                Department dep = departments [i];
            }

        }
    }
}
