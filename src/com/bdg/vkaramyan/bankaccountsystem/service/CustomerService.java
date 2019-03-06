package com.bdg.vkaramyan.bankaccountsystem.service;

import com.bdg.vkaramyan.bankaccountsystem.CRUD.CustomerCreateParameter;
import com.bdg.vkaramyan.bankaccountsystem.entity.Customer;

public interface CustomerService {
	
	Customer create(CustomerCreateParameter createParameter);
	boolean delete();
	Customer update();
	Customer get();
	

}
