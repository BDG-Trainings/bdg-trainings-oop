package com.bdg.spapoyan.BookStorage;

public class AuthorUpdaetParameter {

    private int id;
    private String name;
    private String surname;

    public AuthorUpdaetParameter(final int id, final String name, final String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }
}
