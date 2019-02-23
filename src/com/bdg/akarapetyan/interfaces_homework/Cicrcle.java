package com.bdg.akarapetyan.interfaces_homework;

public class Cicrcle implements GeometricObject {

    protected double radius = 1.0;

    public Cicrcle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(2, radius);
    }
}
