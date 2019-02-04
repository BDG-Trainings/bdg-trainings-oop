package com.bdg.hhertevtsyan.circlecylinder;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "green");
        Cylinder cylinder = new Cylinder();
        cylinder.setColor("blue");
        cylinder.setHeight(2);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getColor());
    }
}
