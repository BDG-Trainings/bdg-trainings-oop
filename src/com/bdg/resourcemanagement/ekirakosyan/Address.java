package com.bdg.resourcemanagement.ekirakosyan;

public class Address {
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

    public String getStreet() {
        return street;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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
