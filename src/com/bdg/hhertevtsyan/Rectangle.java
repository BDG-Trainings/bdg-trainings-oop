package com.bdg.hhertevtsyan;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle () {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle (final float length, final float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength () {
        return length;
    }

    public float getWidth () {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea () {
        return length*width;
    }

    public double getPerimeter () {
        return 2*length + 2*width;
    }

    public String toString() {
        return "Rectangle [length = " + length + ", width = " + width + "]";
    }
}
