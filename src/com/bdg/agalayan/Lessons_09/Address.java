package com.bdg.agalayan.Lessons_09;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address (String street, String state,
                    String city, String zipCode){
        this.street=street;
        this.state = state;
        this.city = city;
        this.zipCode=zipCode;
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

    public void setStreet(String street) {
        this.street = street;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public String toString(){
        return "Address [ state:"+getState()+"," +
                "city:"+getCity()+ "," +
                "street:" + getStreet() +","+
                "zipCode:" + getZipCode() +"]";
    }
}

