package com.bdg.hhertevtsyan.banksystem;

public final class Address {

    private Country country;
    private String city;
    private String street;
    private String phoneNumber;

    public Address (final Country country, final String city, final String  street, final String phoneNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    @Override
    public String toString() {
        return "Address is [" + country + ", " + city + ", " + street + "], Telephon is [" + phoneNumber + "]";
    }
}