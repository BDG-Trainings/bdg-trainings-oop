package com.bdg.vqertikyan.bankaccountsystem.service;


import com.bdg.vqertikyan.bankaccountsystem.entity.Address;
import com.bdg.vqertikyan.bankaccountsystem.entity.Country;

public interface AddressService {

    Address create(Country country, String street);
}
