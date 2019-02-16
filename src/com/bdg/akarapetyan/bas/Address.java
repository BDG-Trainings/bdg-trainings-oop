package com.bdg.akarapetyan.bas;

public final class Address {

    private Country country;
    private String street;
    private String phoneNumber;

    public Address(Country country, String street, String phoneNumber) {
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


