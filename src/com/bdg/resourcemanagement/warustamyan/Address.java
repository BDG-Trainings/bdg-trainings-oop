package com.bdg.resourcemanagement.warustamyan;

public final class Address {

    private final Country country;
    private final String phoneNumber;
    private final String street;

    public Address(final Country country, final String phoneNumber, final String street) {
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

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
