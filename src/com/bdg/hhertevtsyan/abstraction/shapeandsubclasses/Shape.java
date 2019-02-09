package com.bdg.hhertevtsyan.abstraction.shapeandsubclasses;

public abstract class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(final String color, final boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter ();

    public abstract String toString();
}
