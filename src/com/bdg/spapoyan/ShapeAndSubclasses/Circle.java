package com.bdg.spapoyan.ShapeAndSubclasses;

public class Circle extends Shape {

    private double radius = 1.0;

    public Circle(){}
    public Circle(double radius){this.radius = radius;}

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter(){
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
