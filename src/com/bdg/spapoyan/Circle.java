package com.bdg.spapoyan;
public class Circle {
    private double radius;
    private String color;
    public Circle ()
    {
        radius = 1;
        color  = "red";
    }
    public Circle (double r)
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
        return "Circle - [radius = " + radius + " color = " + color + "]";
    }
}
