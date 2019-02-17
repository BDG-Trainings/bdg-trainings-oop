package com.bdg.resourcemanagement.hhertevtsyan;

public class Person {
    private String name;
    private String surename;
    private String middleName;
    private short age;


    public Person (final String name, final String surename, final String middleName, final short age) {
        this.name = name;
        this.surename = surename;
        this.middleName = middleName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: Full Name = " + name + " " + surename + " " + middleName + ", Age: " + age;
    }
}
