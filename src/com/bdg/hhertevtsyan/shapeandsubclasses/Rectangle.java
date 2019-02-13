package com.bdg.hhertevtsyan.shapeandsubclasses;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(final double width, final double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(final double width, final double length, final String color, final boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
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

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle [Width = " + width + ", Length = " + length + ", Area = " + getArea() + ", Perimeter = " + getPerimeter() + ", Color = " + getColor() + ", Is Filled = " + isFilled() + "]";
    }
}
