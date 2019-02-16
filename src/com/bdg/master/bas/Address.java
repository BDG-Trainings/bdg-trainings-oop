package com.bdg.master.bas;


public final class Address {

    private Country country;
    private String street;
    private String phoneNumber;

    public Address (Country country,String street,String phoneNumber){
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
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

    public String getStreet(){
        return street;
    }

    public Country getCountry(){
        return country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Address{"+
                    "country="+'\''+ country.getCountryName()+'\''+
                    ",phon="+'\'' + phoneNumber+'\'' +
                    ",street="+'\'' + street + '\'' +
                "}";
    }
}
