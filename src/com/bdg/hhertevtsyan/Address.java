package com.bdg.hhertevtsyan;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(final String street, final String city, final String state, final String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address: [ Street = " + street + " , City = " + city + " , State = " + state + " , zipCode = " + zipCode + "]";
    }
}
