package com.bdg.osahakyan.designpattern.singletonepattern;

public class SingletonPatternDemo {

    public static void main(String[] args){


        SingleObject object = SingleObject.getInstance();

        object.showMassage();
    }
}
