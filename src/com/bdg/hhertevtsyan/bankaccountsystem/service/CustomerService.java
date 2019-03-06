package com.bdg.hhertevtsyan.bankaccountsystem.service;

import com.bdg.hhertevtsyan.bankaccountsystem.entity.Customer;

public interface CustomerService {

    Customer create (String CustomerJson);
    Customer update (String CustomerJson);
    Customer delete (String CustomerJson);

}
