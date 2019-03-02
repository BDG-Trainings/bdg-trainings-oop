package com.bdg.agalayan.bankAccountSystem.service;

import com.bdg.agalayan.bankAccountSystem.entity.Customer;

public interface CustomerService {

    Customer get (int id);

    Customer create (Customer customer);



    boolean delete (int id);

}
