package com.bdg.hhertevtsyan;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(final double radius) {
        this.radius = radius;
    }

    public Circle(final double radius, final String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle [radius = " + radius + " , color = " + color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCicumference() {
        return 2 * Math.PI * radius;
    }
}
