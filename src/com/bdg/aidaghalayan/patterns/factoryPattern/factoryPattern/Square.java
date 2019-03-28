package com.bdg.aidaghalayan.patterns.factoryPattern.factoryPattern;

public class Square implements Shape {
    private double width;


    @Override
    public void area() {
        System.out.println("Square area ="+width*width);
    }
}
