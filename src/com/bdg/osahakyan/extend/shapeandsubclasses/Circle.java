package com.bdg.osahakyan.extend.shapeandsubclasses;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public String toString() {
        return "Circle[radius=" + getRadius() + "," + "color=" + getColor() + "," + "Area=" + getArea() + "]";
    }
}
