package com.bdg.bookstorage.agalayan.entity;

public class Author {
    private int id;
    private  String name;
    private  String surname;
    private  String gender;

    public Author(String name, String surname, String gender){
        this.gender=gender;
        this.name =name;
        this.surname=surname;

    }


}
