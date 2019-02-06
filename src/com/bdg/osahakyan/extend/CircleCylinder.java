package com.bdg.osahakyan.extend;

import com.bdg.osahakyan.circlefinal.Circle;

public class CircleCylinder extends Circle {

    private double height;

    public CircleCylinder() {
        radius = 1.0;
        color = "red";
        height = 1.0;
    }

    public CircleCylinder(double radius) {
        this.radius = radius;
        color = "red";
        height = 1.0;
    }

    public CircleCylinder(double radius, String color) {
        this.radius = radius;
        this.color = "red";
        height = 1.0;
    }

    public CircleCylinder(double radius, String color, double height) {
        this.radius = radius;
        this.color = color;
        this.height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    } //?

}
