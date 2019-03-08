package com.bdg.aidaghalayan.bankaccountsystem.service;


import com.bdg.aidaghalayan.bankaccountsystem.entity.Address;
import com.bdg.aidaghalayan.bankaccountsystem.entity.Country;

public interface AddressService {

    Address create(Country country, String street);
}
