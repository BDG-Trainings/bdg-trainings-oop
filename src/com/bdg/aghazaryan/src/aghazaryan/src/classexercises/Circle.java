package com.bdg.aghazaryan.src.aghazaryan.src.classexercises;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle () {
        radius = 1.0;
        color = "red";

    }
    public Circle (double radius) {
        radius = 1.0;
    }
    public Circle (double radius, String color) {
        radius = 1.0;
        color = "red";

    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public void setRadius (double radius) {

    }
    public void setColor (String color) {
    }
    public String toString() {

        return String.format("Circle[radius = %s, color = %s ]",  getRadius(), getColor());
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public static void main (String [] args) {
        Circle circleObj = new Circle ();
        System.out.println(circleObj);
    }
}