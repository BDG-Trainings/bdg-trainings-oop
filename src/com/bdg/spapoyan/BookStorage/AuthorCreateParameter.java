package com.bdg.spapoyan.BookStorage;

public class AuthorCreateParameter {

    private String name;
    private String surname;
    private String gender;

    public AuthorCreateParameter(final String name, final String surname, final String gender) {
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

    public String getGender() {
        return gender;
    }
}
