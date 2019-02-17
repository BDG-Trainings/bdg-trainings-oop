package com.bdg.resourcemanagement.hhertevtsyan;

public class Address {
    private String city;
    private String state;
    private String  street;
    private String zipCode;

    public Address (final String city, final String state, final String street, final String zipCode){
        this.city = city;
        this.state = state;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address is: " +state+ ", "+ city +", " +street+ ", " + zipCode;
    }
}
