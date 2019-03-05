package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.service;

import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.Customer;

public interface CustomerService {

    Customer create (Customer createParameter);

    Customer update (Customer createParameter);

    Customer delete ();

    Customer get ();

}
