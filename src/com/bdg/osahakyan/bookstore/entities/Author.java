package com.bdg.osahakyan.bookstore.entities;

public class Author {

    private int id;
    private String name;
    private String surname;
    private String gender;

    public  Author(final int id, final String name, final String surname, final String gender) {
                 this.id = id;
                 this.name = name;
                 this.surname = surname;
                 this.gender = gender;
    }

    public int getID(){return id;}

    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getGender(){return gender;}

    @Override
    public String toString(){
       return   "Author( id: " + id +
                ", Name: " + name +
                ", Surname: " + surname +
                ", gender: " + gender +
                ")";
    }

}
