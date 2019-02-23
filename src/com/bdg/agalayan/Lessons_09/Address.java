package com.bdg.agalayan.Lessons_09;

import com.bdg.agalayan.bas.Country;

public class Address {
    private Country country;
    private String street;
    private String city;
    private String zipCode;

    public Address ( Country country,
                    String city,String street, String zipCode){
        this.street=street;
        this.country = country;
        this.city = city;
        this.zipCode=zipCode;
    }

    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public Country getCountry() {
        return country;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCountry(Country country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public String toString(){
        return "Address [country:"+getCountry()+"," +
                "city:"+getCity()+ "," +
                "street:" + getStreet() +","+
                "zipCode:" + getZipCode() +"]";
    }
}

