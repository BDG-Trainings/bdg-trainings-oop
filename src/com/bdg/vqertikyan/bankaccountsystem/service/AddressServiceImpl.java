package com.bdg.vqertikyan.bankaccountsystem.service;


import com.bdg.vqertikyan.bankaccountsystem.entity.Address;
import com.bdg.vqertikyan.bankaccountsystem.entity.Country;

public class AddressServiceImpl implements AddressService {
    @Override
    public Address create(final Country country, final String street) {
        return new Address(country, street);
    }
}
