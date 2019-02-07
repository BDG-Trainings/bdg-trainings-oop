package com.bdg.spapoyan.ShapeAndSubclasses;

public class Rectangle extends Shape {

    private double width = 1.0;
    private double length = 1.0;

    Rectangle(){}
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
