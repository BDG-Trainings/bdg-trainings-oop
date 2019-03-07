package com.bdg.spapoyan.ShapeAndSubclasses;
public class Circle1 {
    private double radius;
    private String color;
    public Circle1()
    {
        radius = 1;
        color  = "red";
    }
    public Circle1(double r)
    {
        radius = r;
        color  = "red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea()
    {
        return Math.pow(radius, 2) * Math.PI;
    }

    public String toString() {
        return "Circle1 - [radius = " + radius + " color = " + color + "]";
    }
}
