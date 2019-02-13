package com.bdg.osahakyan.bookstore.entities;

public class Author {

    private int id;
    private String name;
    private String surname;
    private String gender;

    public  Author(final int id, final String name, final String surname, final String gender) {
                 this.id = id; this.name = name; this.surname = surname; this.gender = gender;
    }

    public int getID(){return id;}
    public void setID(int id){this.id = id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getSurname(){return surname;}
    public void setSurname(String surname){this.surname = surname;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}

    @Override
    public String toString(){
        String AuthorInfo = "Author ~  id: " + id + ", Name: " + name + ", Surname: " + ", gender: " + gender + ":";
        return AuthorInfo;
    }

}
