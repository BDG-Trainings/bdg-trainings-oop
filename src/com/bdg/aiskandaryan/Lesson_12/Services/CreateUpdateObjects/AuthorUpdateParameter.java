package com.bdg.aiskandaryan.Lesson_12.Services.CreateUpdateObjects;

public class AuthorUpdateParameter {
    private int id;
    private String name;
    private String surname;

    public AuthorUpdateParameter(final int id, final String name, final String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
