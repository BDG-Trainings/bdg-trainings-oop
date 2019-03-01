package com.bdg.spapoyan.bankAccountSystem;

import com.bdg.spapoyan.bankAccountSystem.entity.AbstractBankEntity;
import com.bdg.spapoyan.bankAccountSystem.enumBankAccountSystem.Country;

public class Address extends AbstractBankEntity {

    private Country country;
    private String street;
    private PhoneNumber[] phoneNumbers;

    public Address(final int id, Country country, final String street, PhoneNumber[] phoneNumbers) {
        super (id);
        this.country = country;
        this.street = street;
        this.phoneNumbers = phoneNumbers;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
