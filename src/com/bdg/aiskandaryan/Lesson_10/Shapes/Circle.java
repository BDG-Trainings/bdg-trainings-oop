package com.bdg.aiskandaryan.Lesson_10.Shapes;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {}

    public Circle(final double radius) {
        this.radius = radius;
    }

    public Circle(final String color, final boolean filled, final double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
