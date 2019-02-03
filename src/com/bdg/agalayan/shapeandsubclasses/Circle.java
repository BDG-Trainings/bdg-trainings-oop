package shapeandsubclasses;

import java.lang.reflect.Parameter;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle (double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*radius*Math.PI;

    }
    @Override
    public String toString(){
        return "Circle [radius ="+ radius + ","+ "color ="+ color+ "]";
    }
}

