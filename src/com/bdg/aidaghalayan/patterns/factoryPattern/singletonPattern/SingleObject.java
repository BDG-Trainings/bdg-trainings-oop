package com.bdg.aidaghalayan.patterns.factoryPattern.singletonPattern;

public class SingleObject {
    private static SingleObject insatnce= new SingleObject();

    private SingleObject(){

    }
    public static SingleObject getInsatnce(){
        return insatnce;
    }
    public void showMessage(){
        System.out.println("Hello world!");

    }


}
