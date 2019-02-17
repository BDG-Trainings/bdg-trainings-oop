package com.bdg.resourcemanagement.spapoyan;

public class Address {

    private Country country;
    private String phoneNumber;
    private String street;

    public Address(Country country, String phoneNumber, String street) {
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.street = street;
    }

    public Country getCountry() {
        return country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
