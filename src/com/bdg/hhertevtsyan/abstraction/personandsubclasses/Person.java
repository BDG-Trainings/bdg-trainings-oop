package com.bdg.hhertevtsyan.abstraction.personandsubclasses;

public class Person extends Human {
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected String address;

    public Person(final String firstName, final String lastName, final String middleName, final short age, final String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.address = address;
    }

    @Override
    public void setGender(final String gender) {
        this.gender = gender;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public void setAge(final short age) {
        this.age = age;
    }

    @Override
    public short getAge() {
        return age;
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


    public String getAddress() {
        return address;
    }

    public String getFullName() {
        return firstName + " " + lastName + " " + middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [name = " + getFullName() + ", Address = " + address + "]";
    }
}
