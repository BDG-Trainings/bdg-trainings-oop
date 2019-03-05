package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.service;

import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.Customer;

public abstract class CustomerServiceImpl implements CustomerService {

    @Override

    public Customer create(final Customer createParameter ){

        final Customer customer = new Customer(createParameter.getCustomerName(), createParameter.getCustomerSurname(), createParameter.getCustomerAddress());

        return customer;
    }

    @Override
    public Customer delete() {
        return null;
    }

    @Override
    public Customer get() {
        return null;
    }
}


