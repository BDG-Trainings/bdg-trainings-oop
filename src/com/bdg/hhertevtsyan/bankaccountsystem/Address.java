package com.bdg.hhertevtsyan.bankaccountsystem;

import com.bdg.hhertevtsyan.bankaccountsystem.common.Country;

public class Address {

    private Country country;
    private String street;
    private PhoneNumber [] phoneNumbers;

    public Address (final Country country, final String street, final PhoneNumber [] phoneNumbers) {
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
