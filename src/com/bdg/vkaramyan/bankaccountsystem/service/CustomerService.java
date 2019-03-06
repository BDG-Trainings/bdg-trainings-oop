package com.bdg.vkaramyan.bankaccountsystem.service;

import com.bdg.vkaramyan.bankaccountsystem.common.CustomerCreateParameter;
import com.bdg.vkaramyan.bankaccountsystem.entity.Customer;

public interface CustomerService {
	
	Customer create(CustomerCreateParameter createParameter);
	boolean delete();
	Customer update();
	Customer get();
	

}
