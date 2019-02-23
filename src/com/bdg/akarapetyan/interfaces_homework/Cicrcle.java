package com.bdg.akarapetyan.interfaces_homework;

public class Cicrcle implements GeometricObject {

    protected double radius;

    public Cicrcle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
