package com.bdg.hhertevtsyan.BookStorage;

public class Author {
    private String name;
    private String surename;
    private String gender;
    private int id;

    public Author (final int id, final String name, final String surename, final String gender) {
        this.id=id;
        this.name = name;
        this.surename = surename;
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
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
