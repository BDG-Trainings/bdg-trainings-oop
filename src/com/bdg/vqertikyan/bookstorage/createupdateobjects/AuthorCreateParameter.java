package com.bdg.vqertikyan.bookstorage.createupdateobjects;

public class AuthorCreateParameter {
    private String name;
    private String surName;
    private String gender;

    public AuthorCreateParameter(String name, String surName, String gender){
        this.name = name;
        this.surName = surName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getGender() {
        return gender;
    }
}
