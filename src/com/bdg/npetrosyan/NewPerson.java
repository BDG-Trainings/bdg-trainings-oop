package com.bdg.npetrosyan;

public class NewPerson {
    private String name;
    private String lastName;


    public NewPerson() {

    }

    public NewPerson(String name) {
        this.name = name;
    }

    public NewPerson(String name, String lastName) {
        this.lastName = lastName;
        this.name = name;
    }
    public void setName(String newName){
        name = newName;
    }
    public void  setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String toStringPerson() {
            return "ddddd";
    }

    public String toString() {
        return "Person { name : " + name + ", lastName : " + lastName + "}";
    }
}


