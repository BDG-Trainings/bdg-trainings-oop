package com.bdg.hhertevtsyan.BookStorage.createupdateobjects;

import com.bdg.hhertevtsyan.BookStorage.common.Gender;

public class AuthorCreateParameter {
    private int id;

    private String name;
    private String surename;
    private Gender gender;

    public AuthorCreateParameter (final int id, final String name, final String surename, final Gender geneder) {
        this.id = id;
        this.name= name;
        this.surename = surename;
        this.gender = geneder;
    }

    public int getId () {return id;}

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
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
