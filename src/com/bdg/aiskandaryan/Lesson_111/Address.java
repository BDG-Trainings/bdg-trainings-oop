package com.bdg.aiskandaryan.Lesson_111;

import com.bdg.aiskandaryan.Lesson_111.Entities.Country;
import com.bdg.aiskandaryan.Lesson_111.Entities.PhoneNumber;

public class Address {
    private Country country;
    private String street;
    private PhoneNumber[] phoneNumbers;

    public Address(final Country country, final String street, final PhoneNumber[] phoneNumbers) {
        this.country = country;
        this.street = street;
        this.phoneNumbers = phoneNumbers;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(final PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
