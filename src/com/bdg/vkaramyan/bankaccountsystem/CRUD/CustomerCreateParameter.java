package com.bdg.vkaramyan.bankaccountsystem.CRUD;

import com.bdg.vkaramyan.bankaccountsystem.entity.Address;

public class CustomerCreateParameter {
	
	private String customerName;
	private String customerSurname;
	private Address customerAddress;
	
	
	public CustomerCreateParameter(String customerName, String customerSurname, Address customerAddress) {
		
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.customerAddress = customerAddress;
	}


	public String getCustomerName() {
		return customerName;
	}


	public String getCustomerSurname() {
		return customerSurname;
	}


	public Address getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}


	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}


	@Override
	public String toString() {
		return "CustomerCreateParameter [customerName=" + customerName + ", customerSurname=" + customerSurname
				+ ", customerAddress=" + customerAddress + "]";
	}
	
	

}
