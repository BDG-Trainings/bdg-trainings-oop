package com.bdg.spapoyan.patterns.SingletonPattern;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();

        object.showMesssage();
    }
}
