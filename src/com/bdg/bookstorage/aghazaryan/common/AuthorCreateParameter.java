package com.bdg.bookstorage.aghazaryan.common;

public class AuthorCreateParameter {

    private String name;
    private String surname;
    private Gender gender;

    public AuthorCreateParameter (String name, String surname, Gender gender ){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public Gender getGender() {

        return gender;
    }

    public void setGender(Gender gender){
        this.gender =gender;
    }
    @Override
    public String toString() {
        return "Author{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}