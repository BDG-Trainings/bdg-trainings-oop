package com.bdg.osahakyan.interfacetasks;

public class Circle implements GeometricObject {

    protected double radius;

    public Circle(final double radius){
        this.radius = radius;
    }

    public double getRadius(){return radius;}

    @Override
    public double getParameter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    public String toString() {
        return "Circle[ " +
                "radius = " + radius +
                ", Parameter = " + getParameter() +
                ", Area = " + getArea() +
                "]";
    }
}
