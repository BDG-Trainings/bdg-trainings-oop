package com.bdg.master.bankaccountsystem.service;


import com.bdg.master.bankaccountsystem.entity.Address;
import com.bdg.master.bankaccountsystem.entity.Country;

public class AddressServiceImpl implements AddressService {
    @Override
    public Address create(final Country country, final String street) {
        return new Address(country, street);
    }
}
