package com.bdg.agalayan.bankAccountSystem.entity;


import com.bdg.agalayan.bankAccountSystem.enums.Country;

import java.time.LocalDate;
import java.util.Arrays;

public class Address extends AbstractBankEntity {
    private Country country;
    private String street;
    private PhoneNumber[] phoneNumbers;



   public Address( Country country, String street, PhoneNumber[] phoneNumbers) {

        this.country = country;
        this.street = street;
        this.phoneNumbers = phoneNumbers;

    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public Country getCountry() {
        return country;
    }

    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString(){
       return "Address ["+country+
               ", street:"+ street+
               ", phonNumber:"+ Arrays.toString(phoneNumbers)+"]";
    }

}
