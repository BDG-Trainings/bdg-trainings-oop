package com.bdg.hhertevtsyan.circlecylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder () {}

    public Cylinder (final double radius) {
        this.setRadius(radius);
    }

    public Cylinder (final double radius, final double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder (final double radius, final double height, final String color) {
        this.radius = radius;
        this.height = height;
        this.setColor(color); // if color is protected - this.color = color;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume () {
        return this.getArea()*height;
    }
}
