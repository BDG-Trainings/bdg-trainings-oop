package com.bdg.akarapetyan.inheritance_homework;

public class Executor {

    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        System.out.println(c.getArea());

        Person p = new Person("Arsen", "Yerevan");
        System.out.println(p.toString());
    }
}
