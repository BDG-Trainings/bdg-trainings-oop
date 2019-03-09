package com.bdg.vqertikyan.address;


import com.bdg.vqertikyan.bankaccountsystem.PhoneNumber;
import com.bdg.vqertikyan.bankaccountsystem.entity.Country;


import java.util.Arrays;

public final class Address {

    private PhoneNumber[] phoneNumbers;
    private Country country;
    private String street;


    public Address(final PhoneNumber[] phoneNumbers, final Country country, final String street) {
        this.phoneNumbers = phoneNumbers;
        this.country = country;
        this.street = street;
    }

    public Address() {
    }

    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(final PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "phoneNumbers=" + Arrays.toString(phoneNumbers) +
                ", country=" + country +
                ", street='" + street + '\'' +
                '}';
    }

}
