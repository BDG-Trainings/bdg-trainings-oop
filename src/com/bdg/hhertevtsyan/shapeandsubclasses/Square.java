package com.bdg.hhertevtsyan.shapeandsubclasses;

public class Square extends Rectangle {

    public Square () {}

    public Square (final double side) {
        setLength(side);
        setWidth(side);
    }

    public Square (final double side, final String color, final boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide () {
        return getWidth();
    }

    public void setSide (final double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square [Width = " + getWidth() + ", Length = " + getLength() + ", Area = " + getArea() + ", Perimeter = " + getPerimeter() + ", Color = " + getColor() + ", Is Filled = " + isFilled() + "]";
    }
}
