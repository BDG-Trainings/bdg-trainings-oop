package com.bdg.resourcemanagement.aghazaryan;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private short age;
    private Address[] address;

    public Person (String firstName, String lastName, String middleName, short age, Address[] address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public String getMiddleName() {

        return middleName;
    }

    public short getAge() {

        return age;
    }

    public Address[] getAddresses (){
        return address;
    }
}