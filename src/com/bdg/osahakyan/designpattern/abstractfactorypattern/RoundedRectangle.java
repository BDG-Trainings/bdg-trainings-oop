package com.bdg.osahakyan.designpattern.abstractfactorypattern;

import com.bdg.osahakyan.designpattern.factorypattern.Shape;

public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle there is a drew() method.");
    }
}
