package com.bdg.spapoyan.patterns.SingletonPattern;

public final class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMesssage (){
        System.out.println("Hello World!");
    }
}
