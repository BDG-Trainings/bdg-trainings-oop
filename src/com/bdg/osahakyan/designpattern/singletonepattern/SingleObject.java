package com.bdg.osahakyan.designpattern.singletonepattern;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMassage(){
        System.out.println("Hello World");
    }
}
