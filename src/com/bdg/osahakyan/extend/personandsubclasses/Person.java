package com.bdg.osahakyan.extend.personandsubclasses;

public class Person {

    protected String name;
    protected String address;

    public Person(String name, String address){ this.name = name; this.address = address;}

    public String getName(){return name;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}

    public String toString(){ return "Person("+ getName() + "," + getAddress() + ")"; }

}
