package com.bdg.resourcemanagement.hhertevtsyan;

import com.bdg.resourcemanagement.hhertevtsyan.enums.CountryEnum;

public class Person {
    private String name;
    private String surename;
    private String middleName;
    private short age;
    private Address [] addresses;


    public Person (final String name, final String surename, final String middleName, final short age, final Address [] addresses) {
        this.name = name;
        this.surename = surename;
        this.middleName = middleName;
        this.age = age;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public String getMiddleName() {
        return middleName;
    }

   public short getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person: Full Name = " + name + " " + surename + " " + middleName + ", Age: " + age;
    }
}
