package com.bdg.hhertevtsyan.circlecylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle () {
    }

    public Circle (final double radius) {
        this.radius = radius;
    }

    public Circle (final double radius, final String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea () {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString () {
        return "Circle [radius = " + radius + ", color = " + color + "]";
    }
}
