package com.bdg.aiskandaryan.Lesson_11.Shapes;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {}

    public Rectangle(final double width, final double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(final String color, final boolean filled, final double width, final double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(final double length) {
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
        return "Rectangle{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
