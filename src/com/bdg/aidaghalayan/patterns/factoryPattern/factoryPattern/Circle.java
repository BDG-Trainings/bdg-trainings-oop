package com.bdg.aidaghalayan.patterns.factoryPattern.factoryPattern;

public class Circle implements Shape {
    private double radius;



    @Override
    public void area() {
        System.out.println("Circle area="+ Math.PI*radius*radius);
    }
}
