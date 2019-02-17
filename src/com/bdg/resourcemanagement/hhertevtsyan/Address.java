package com.bdg.resourcemanagement.hhertevtsyan;

import com.bdg.resourcemanagement.hhertevtsyan.enums.CountryEnum;

public class Address {
    private CountryEnum country;
    private String  street;
    private String phoneNumber;

    public Address (final CountryEnum country, final String street, final String phoneNumber){
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    public CountryEnum getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Address is: " +country.getCountryName()+ ", "+ country.getCity() +", " +street+ ", " + phoneNumber;
    }
}
