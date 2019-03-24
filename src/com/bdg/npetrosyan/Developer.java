package com.bdg.npetrosyan;

public class Developer extends Employee {
    private int age;

    public Developer(int age, String name){
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return "Developer age : " + age + " Name :   " + super.getName();
    }
}
