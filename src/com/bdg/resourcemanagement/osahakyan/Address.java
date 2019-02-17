package com.bdg.resourcemanagement.osahakyan;

public final class Address {
    private final Country country;
    private final String street;
    private final String phoneNumber;

    public Address(final Country country, final String street, final String phoneNumber) {
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
        return "Address (" +
                "Country: " + country + "," +
                "Street: " + street + "," +
                "PhoneNumber: " + phoneNumber + ", " +
                ")";
    }
}
