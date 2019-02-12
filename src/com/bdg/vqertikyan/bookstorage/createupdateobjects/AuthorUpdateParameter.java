package com.bdg.vqertikyan.bookstorage.createupdateobjects;

public class AuthorUpdateParameter {
    private int id;
    private String name;
    private String surName;

    public AuthorUpdateParameter(int id, String name, String surName){
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

}
