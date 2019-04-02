package com.bdg.osahakyan.designpattern.abstractfactorypattern;

import com.bdg.osahakyan.designpattern.factorypattern.Shape;

public class RoundedSquare implements Shape {


    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare there is a drew() method.");
    }
}
