package com.bdg.aiskandaryan.Lesson_11.Cyrcle_Cylinder;

public class Cylinder1 extends Circle1 {
    private double height = 1.0;

    public Cylinder1(double height) {
        this.height = height;
    }

    public Cylinder1(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder1(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
