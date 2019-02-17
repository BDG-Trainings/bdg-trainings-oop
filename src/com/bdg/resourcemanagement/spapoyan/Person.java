package com.bdg.resourcemanagement.spapoyan;

import java.util.Arrays;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private short age;
    private Address[] addresses;


    public Person(String firstName, String lastName, String middleName, short age, Address[] addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.addresses = addresses;
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

    public Address[] getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", addresses=" + Arrays.toString(addresses) +
                '}';
    }
}
