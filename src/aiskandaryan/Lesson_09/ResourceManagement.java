package aiskandaryan.Lesson_09;

public class ResourceManagement {
    private Department [] departments;

    public void addEmployeeToDepartment(final Employee employee,final String departmentName) {
        Department department = findDepartmentByName(departmentName);
        if (department != null) {
            department.addEmployee(employee);
        }
    }

    public void removeEmployeeFromDepartment(final Employee employee,final String departmentName) {
        Department department = findDepartmentByName(departmentName);
        if (department != null) {
            department.removeEmployee(employee);
        }
    }

    public final Department findDepartmentByName(final String  departmentName) {
        Department department = null;
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getDepartmentName().equals(departmentName)) {
                department = departments[i];
                break;
            }
        }
        return department;
    }

    public final Department getDepartmentWithMaxSalary() {
        if (departments.length > 0) {
            Department maxDepartment = departments[0];
            for (int  i = 0; i < departments.length; i++) {
                if (departments[i].getBudget() > maxDepartment.getBudget()) {
                    maxDepartment = departments[i];
                }
            }
            return maxDepartment;
        } else {
            return null;
        }
    }
}
