package com.bdg.ekirakosyan.GeometricShapes.Circle;

public class Circle {

    double radius;

    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        //A=π*r*r
        double A = Math.PI * Math.pow(this.radius,2);
        return A;
    }
    public double getCircumference(){
        //C=2πr
        double C = 2*this.radius*Math.PI;
        return C;
    }
    @Override
    public String toString() {
        String str = "Circle[radius="+this.radius+"]";
        return str;
    }
}
