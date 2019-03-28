package com.bdg.aidaghalayan.patterns.factoryPattern.factoryPattern;

public class Rectangle implements Shape {
    private double length;
    private double width;

    @Override
    public void area() {
        System.out.println("Rectangle area="+length*width);
    }
}