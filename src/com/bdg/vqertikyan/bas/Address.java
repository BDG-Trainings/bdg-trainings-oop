package com.bdg.vqertikyan.bas;


public final class Address {

    public Address(Country country, String street, String phoneNumber) {
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    private Country country;
    private String street;
    private String phoneNumber;


}
