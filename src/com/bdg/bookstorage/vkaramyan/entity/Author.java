package com.bdg.bookstorage.vkaramyan.entity;

import com.bdg.bookstorage.vkaramyan.common.Gender;

public class Author {

    private String name;
    private String surname;
    private int id;
    private Gender gender;

    public Author(final String name, final String surname, final int id, final Gender gender) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + ", surname=" + surname + ", id=" + id + ", gender=" + gender + "]";
    }


}
