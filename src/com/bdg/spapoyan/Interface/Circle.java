package com.bdg.spapoyan.Interface;

public class Circle implements GeometricObject {

    protected double radius = 1.0;

    public Circle (double radius){
        this.radius = radius;

    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
