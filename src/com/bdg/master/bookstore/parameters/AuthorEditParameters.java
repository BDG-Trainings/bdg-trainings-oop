package com.bdg.master.bookstore.parameters;


public final class AuthorEditParameters {

    private String name;
    private String surname;

    public AuthorEditParameters(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
