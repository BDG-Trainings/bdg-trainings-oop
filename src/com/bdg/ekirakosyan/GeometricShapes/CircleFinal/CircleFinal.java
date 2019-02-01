package com.bdg.ekirakosyan.GeometricShapes.CircleFinal;

public class CircleFinal {

    double radius;
    String color;

    public CircleFinal(){
        this.radius = 1.0;
        this.color = "red";
    }
    public CircleFinal(double radius){
        this.radius = radius;
    }
    public CircleFinal(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        //A=π*r*r
        double A = Math.PI * Math.pow(this.radius,2);
        return A;
    }

    @Override
    public String toString() {
        String str = "Circle[radius="+this.radius+", color="+this.color+"]";
        return str;
    }
}
