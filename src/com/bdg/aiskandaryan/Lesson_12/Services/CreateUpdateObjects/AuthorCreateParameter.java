package com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects;

public class AuthorCreateParameter {
    private String name;
    private String surname;
    private boolean gender;

    public AuthorCreateParameter(final String name, final String surname, final boolean gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isGender() {
        return gender;
    }
}
