package com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects;

public class AuthorUpdateParameter {
    private int id;
    private String name;
    private String surname;
    private boolean gender;

    public AuthorUpdateParameter(final int id, final String name, final String surname, final boolean gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getId() {
        return id;
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
