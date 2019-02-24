package com.bdg.bookstorage.vqertikyan.common;

public class AuthorCreateParameter {
    private String name;
    private String surName;
    private Gender gender;

    public AuthorCreateParameter(final String name, final String surName, final Gender gender) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AuthorCreateParameter{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
