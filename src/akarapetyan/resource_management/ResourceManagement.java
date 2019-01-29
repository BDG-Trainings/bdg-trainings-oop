package akarapetyan.resource_management;

public class ResourceManagement {

    private Department departments [];

    public ResourceManagement (){
    }

    public void addEmployeeToDepartment (Employee emp, String departmentName){

        Department dep = searchDepartment(departmentName);
        Employee [] employee_update = new Employee[dep.getEmployees().length +1];
        for (int i = 0; i < dep.getEmployees().length; i++)
        {
            employee_update[i] = dep.employees[i];
        }
        employee_update [dep.getEmployees().length] = emp;
        dep.employees = employee_update;
    }

    public void removeEmployeeFromDepartment (Employee emp, String departmentName){

        Department dep = searchDepartment(departmentName);
        Employee [] employee_update = new Employee[dep.getEmployees().length - 1];
        for (int i = 0; i < dep.getEmployees().length - 1; i++) {

            if (emp != dep.employees[i]) {
                employee_update[i] = dep.employees[i];
            }
        }
        dep.employees = employee_update;
    }

    public Department searchDepartment (String departmentName){

        Department dep = null;

        for (int i=0; i < departments.length; i++){

            if (departments[i].getDepartmentName() == departmentName)
            {
                dep = departments [i];
            }
        } return  dep;
    }

    public Employee findEmployeeByName (String firstName, String lastName){

        Department dep = null;
        Employee emp = null;

        for (int i =0; i < departments.length; i++ ) {
            for (int m = 0; m < dep.getEmployees().length - 1; m++) {

                dep.getEmployees();
            }
        } return emp;
    }



}
