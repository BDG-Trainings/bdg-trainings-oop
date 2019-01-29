package akarapetyan.resource_management;

public class ResourceManagement {

    private Department departments [];

    public ResourceManagement (){
    }

    public void addEmployeeToDepartment (Employee emp, String departmentName){

        Department dep = null;

        for (int i=0; i < departments.length; i++){

            if (departments[i].getDepartmentName() == departmentName)
            {
                dep = departments [i];
            }

        }
        Employee [] employee_update = new Employee[dep.getEmployees().length +1];

        for (int i = 0; i < dep.getEmployees().length; i++)
        {
            employee_update[i] = dep.employees[i];
        }
        employee_update [dep.getEmployees().length] = emp;
        dep.employees = employee_update;
    }
}
