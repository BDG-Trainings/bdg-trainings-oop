package com.bdg.bookstorage.osahakyan.entity;


import com.bdg.bookstorage.osahakyan.entity.common.Gender;

public class Author {

    private int id;
    private String name;
    private String surname;
    private Gender gender;

    public  Author(final int id, final String name, final String surname, final Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getId(){return id;}

    public String getName(){return name;}

    public String getSurname(){return surname;}

    public Gender getGender(){return gender;}

    @Override
    public String toString(){
        return   "Author( id: " + id +
                ", Name: " + name +
                ", Surname: " + surname +
                ", gender: " + gender +
                ")";
    }

}
