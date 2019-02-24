package com.bdg.bookstorage.osahakyan.common;

public class AuthorCreateParameters {

    private String name;
    private String surname;
    private Gender gender;

    public AuthorCreateParameters(final String name, final String surname, final Gender gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }
}
