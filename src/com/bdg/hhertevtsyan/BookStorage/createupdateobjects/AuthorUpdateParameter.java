package com.bdg.hhertevtsyan.BookStorage.createupdateobjects;

public class AuthorUpdateParameter {
    private int id;
    private String name;
    private String gender;

    public AuthorUpdateParameter (final int id, final String name, final String gender) {
        this.id = id;
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
