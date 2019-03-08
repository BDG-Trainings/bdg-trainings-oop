package com.bdg.master.bankaccountsystem.service;


import com.bdg.master.bankaccountsystem.entity.Address;
import com.bdg.master.bankaccountsystem.entity.Country;

public interface AddressService {

    Address create(Country country, String street);
}
