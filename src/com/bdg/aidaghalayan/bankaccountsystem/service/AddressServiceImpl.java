package com.bdg.aidaghalayan.bankaccountsystem.service;


import com.bdg.aidaghalayan.bankaccountsystem.entity.Address;
import com.bdg.aidaghalayan.bankaccountsystem.entity.Country;

public class AddressServiceImpl implements AddressService {
    @Override
    public Address create(final Country country, final String street) {
        return new Address(country, street);
    }
}
