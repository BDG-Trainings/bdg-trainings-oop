package com.bdg.akarapetyan.bankaccountsystem;

import com.bdg.akarapetyan.bas.Country;

public final class Address {

    private com.bdg.akarapetyan.bankaccountsystem.Country country;
    private String street;
    private String phoneNumber;

    public Address(com.bdg.akarapetyan.bankaccountsystem.Country country, String street, String phoneNumber) {
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    public com.bdg.akarapetyan.bankaccountsystem.Country getCountry() {
        return country;
    }

    //public void setCountry(Country country) {
       // this.country = country;
    //}

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", street='" + street + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}


