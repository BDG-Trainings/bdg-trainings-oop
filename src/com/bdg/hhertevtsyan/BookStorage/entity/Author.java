package com.bdg.hhertevtsyan.BookStorage.entity;

import com.bdg.hhertevtsyan.BookStorage.common.Gender;

public class Author {
    private String name;
    private String surname;
    private Gender gender;
    private int id;

    public Author(final int id, final String name, final String surname, final Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surname;
    }

    public void setSurename(String surename) {
        this.surname = surename;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
