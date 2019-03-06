package com.bdg.vkaramyan.bankaccountsystem.service;

import com.bdg.vkaramyan.bankaccountsystem.CRUD.CustomerCreateParameter;
import com.bdg.vkaramyan.bankaccountsystem.entity.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	

	@Override
	public Customer create(CustomerCreateParameter createParameter) {
		
		 final Customer customer = new Customer(1, createParameter.getCustomerName(), createParameter.getCustomerSurname(), createParameter.getCustomerAddress());

	        return customer;
		
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
