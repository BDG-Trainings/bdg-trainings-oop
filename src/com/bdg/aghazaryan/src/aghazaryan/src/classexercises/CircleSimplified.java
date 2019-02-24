package com.bdg.aghazaryan.src.aghazaryan.src.classexercises;

public class CircleSimplified {

    private double radius = 1.0;

    public CircleSimplified () {
        radius = 1.0;
    }

    public CircleSimplified (double radius) {
        radius = 1.0;
    }
    public double getRadius() {
        return radius;

    }
    public void setRadius (double radius) {

    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

}