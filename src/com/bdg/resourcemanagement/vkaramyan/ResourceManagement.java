package com.bdg.resourcemanagement.vkaramyan;

public class ResourceManagement {
	
	private Department [] departments;
	private int currentIndex;

	    public ResourceManagement(final int departmentSize) {
	        this.departments = new Department[departmentSize];
	    }
	    
	    public boolean addDepartment(final Department department) {
	    	return true;
	    	
	    }

}
