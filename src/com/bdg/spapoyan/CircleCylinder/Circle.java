package com.bdg.spapoyan.CircleCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){

       }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color){
        this.radius = radius; this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double getArea () {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString(){
        return "Circle1[radius = " + radius + ", " + "color = " + color + "]";
    }
}
