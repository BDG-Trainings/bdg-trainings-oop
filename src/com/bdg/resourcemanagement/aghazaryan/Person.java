package com.bdg.resourcemanagement.aghazaryan;
import java.util.Arrays;

public class Person {
    private int ID;
    private String firstName;
    private String lastName;
    private String middleName;
    private int  age;
    private Address[] address;

    public Person(String firstName, String lastName, String middleName, int age, Address[] address) {
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

    public int  getAge() {

        return age;
    }

    public Address[] getAddresses() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", addresses=" + Arrays.toString(address) +
                '}';
    }
}