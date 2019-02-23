package com.bdg.akarapetyan.interfaces_homework;

public class Cicrcle implements GeometricObject {

    protected double radius = 1.0;

    public Cicrcle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
