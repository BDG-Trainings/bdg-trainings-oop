package com.bdg.osahakyan.bookstore.createupdateobjects;

public class AuthorCreateParameters {

    private String name;
    private String surname;
    private String gender;

    public AuthorCreateParameters(final String name, final String surname, final String gender){
        this.name = name; this.surname = surname; this.gender = gender;
    }

    public String getName(){return name;}
    public String getSurname(){return surname;}
    public String getGender(){return gender;}

    @Override
    public String toString(){
        String AuthorCreateParametersInfo = "AuthorCreateParameters ~  Name: " + name + ", Surname: "+ surname + ", gender: " + gender + ":";
        return AuthorCreateParametersInfo;
    }

}
