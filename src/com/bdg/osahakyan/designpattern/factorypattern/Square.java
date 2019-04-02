package com.bdg.osahakyan.designpattern.factorypattern;

import com.bdg.osahakyan.designpattern.factorypattern.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square there is a draw() method.");
    }
}
