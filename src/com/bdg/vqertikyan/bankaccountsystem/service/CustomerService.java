package com.bdg.vqertikyan.bankaccountsystem.service;

import com.bdg.vqertikyan.bankaccountsystem.entity.Address;
import com.bdg.vqertikyan.bankaccountsystem.entity.Customer;

public interface CustomerService {
    Customer create(String customerName, String customerSurname, Address customerAddress);
}