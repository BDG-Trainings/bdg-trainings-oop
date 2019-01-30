package com.bdg.hhakobyan;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private short age;
    private Address [] addresses;

    public Person (String firstName, String lastName, String middleName, short age, Address [] addresses){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.addresses = addresses;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public short getAge() {
        return this.age;
    }

    public Address[] getAddresses() {
        return this.addresses;
    }

    public String toString() {
        return "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nMiddle name: " + middleName + "\nAge: " + age
                + "\nAddress 1: " + addresses[0].toString() + "\nAddress 2: " + addresses[1].toString() + "\nAddress 3: " + addresses[2].toString();
    }
}
