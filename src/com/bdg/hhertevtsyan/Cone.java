package com.bdg.hhertevtsyan;

public class Cone {
    private Circle circle;
    private double h;

    public Cone(Circle circle, double h) {
        this.circle = circle;
        this.h = h;
    }

    public double getVolume() {
        return circle.getArea() * h / 3;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Cone cone = new Cone(circle, 3);
        System.out.println("Volume = " + cone.getVolume());
    }
}
