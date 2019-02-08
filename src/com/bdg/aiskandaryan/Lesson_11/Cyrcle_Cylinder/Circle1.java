package com.bdg.aiskandaryan.Lesson_11.Cyrcle_Cylinder;

public class Circle1 {
    protected double radius = 1.0;
    protected String color = "red";

    public Circle1() {}

    public Circle1(final double radius) {
        this.radius = radius;
    }

    public Circle1(final double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}
