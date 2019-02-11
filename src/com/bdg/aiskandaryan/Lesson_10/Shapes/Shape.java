package com.bdg.aiskandaryan.Lesson_10.Shapes;

public class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape() {}

    public Shape(final String color, final boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(final boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}