package com.bdg.aiskandaryan.Lesson_12;

public class Author {
    private int id;
    private String name;
    private String surname;
    private boolean gender; // Sorry, but male = true, female = false;

    public Author(final int id, final String name, final String surname, final boolean gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public boolean isMale() {
        return gender;
    }

    public void setGender(final boolean gender) {
        this.gender = gender;
    }
}
