package com.bdg.hhertevtsyan.abstraction.shapeandsubclasses;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle () {}

    public Circle (final double radius) {
        this.radius = radius;
    }


    public Circle(final double radius, final String color, final boolean filled) {
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
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle [Radius = " + radius + ", Area = " + getArea() + ", Perimeter = " + getPerimeter() + ", Color = " + getColor() + ", Is Filled = " + isFilled() + "]";
    }
}
