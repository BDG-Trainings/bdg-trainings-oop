package com.bdg.vkaramyan.resourceManagement;


public class ResourceManagement {
	
	private Department [] departments;
	Department department = null;
	
	public ResourceManagement (Department [] departments) {
		this.departments = departments;
	}
	
	public Department findDepartmentByName(String departmentName) {
		for (int i = 0; departments.length > i; i++) {
			if(departments[i].getDepartmentName() == departmentName) {
				department = departments[i];
			}
		}
		return department;
	}
	
	public Employees findEmployeeByName(String Name) {
		 Employees [] employees = null;
	        Employees employee = null;

	        for (int i =0; i < departments.length; i++ ) {
	            employees = departments[i].getEmployees();
	            for (int k = 0; k < employees.length; k++) {
	                if (employees[k].getPerson().getFullName() == Name){
	                    employee = employees [k];
	                }
	            }
	        }
	        return employee;
	    }

	    public void addEmployeeToDepartment(Employees employee, String departmentName){

	        Department department = findDepartmentByName(departmentName);
	        Employees [] addEmployee = new Employees[department.getEmployees().length + 1];
	        for (int i = 0; i < department.getEmployees().length; i++) {
	        
	            addEmployee[i] = department.getEmployees()[i];
	        }
	        
	        addEmployee [department.getEmployees().length] = employee;
	        department.setEmployees(addEmployee);
	    
	    }

	    public void removeEmployeeFromDepartment(Employees employee, String departmentName){

	        Department department = findDepartmentByName(departmentName);
	        Employees [] addEmployee = new Employees[department.getEmployees().length - 1];
	        for (int i = 0; i < department.getEmployees().length - 1; i++) {

	            if (employee != department.getEmployees()[i]) {
	            	addEmployee[i] = department.getEmployees()[i];
	            }
	        }
	        department.setEmployees(addEmployee);
	    }


	    public Department getDepartmentWithMaxSalary(){
	    	
	        Department departmentWithMaxSalary = null;
	        for (int i=0; i<departments.length; i++) {
	        	if (departments[i].getDepartmentSalary() > departmentWithMaxSalary.getDepartmentSalary()) {
	        departmentWithMaxSalary = departments[i];
	   
	        	}
	        }
	        return departmentWithMaxSalary;
	    }
	}

