package com.bdg.osahakyan.bookstore.createupdateobjects;

public class AuthorUpdateParameters {

    private int id;
    private String name;
    private String surname;

    public AuthorUpdateParameters(final int id, final String name, final String surname){
        this.id = id; this.name = name; this.surname = surname;
    }

    public int getID(){return id;}
    public String getName(){return name;}
    public String getSurname(){return surname;}

}
