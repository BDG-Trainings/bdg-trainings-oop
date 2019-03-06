package com.bdg.vkaramyan.bankaccountsystem.service;


import com.bdg.vkaramyan.bankaccountsystem.CRUD.AccountCreateParameter;
import com.bdg.vkaramyan.bankaccountsystem.CRUD.CustomerCreateParameter;
import com.bdg.vkaramyan.bankaccountsystem.entity.Account;
import com.bdg.vkaramyan.bankaccountsystem.entity.Customer;

public class AccountServiceImpl implements AccountService{
	
	private CustomerService customerService;
	
	
	AccountServiceImpl(){
		this.customerService = new CustomerServiceImpl();
	}
	
	
	@Override
	public Account create (AccountCreateParameter createParameter) {
		
		final Customer [] customers = new Customer[createParameter.getCustomerCreateParameter().length];
		
		int i = 0;
        for (CustomerCreateParameter p : createParameter.getCustomerCreateParameter()) {
            customers[i] = this.customerService.create(p);
            i++;
        }   
            
        	final Account account = new Account(1, createParameter.getCustomer(), createParameter.getCreditCard(), createParameter.getAccountBalance());


            return null;
        
	}
	
	
	@Override
	public Account update() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}


	


	@Override
	public Account get() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
