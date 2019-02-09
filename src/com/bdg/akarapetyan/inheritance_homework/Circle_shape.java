package com.bdg.akarapetyan.inheritance_homework;

public class Circle_shape extends Shape {

    private double radius = 1.0;

    public Circle_shape() {
    }

    public Circle_shape(double radius) {
        this.radius = radius;
    }

    public Circle_shape(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle_shape{" +
                "radius=" + radius +
                '}';
    }
}
