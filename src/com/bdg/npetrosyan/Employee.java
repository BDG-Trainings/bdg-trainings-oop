package com.bdg.npetrosyan;

public class Employee {
    private String name;


    public Employee(String name){
        this.name = name;
    }

    public Employee(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Employee : " + name;
    }
}
