package com.bdg.vqertikyan.bookstorage.entities;

public class Author {

    private int id;
    private String name;
    private String surName;
    private String gender;

    public Author(int id, String name, String surName, String gender){
        this.id = id;
        this.name = name;
        this.surName = surName;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
