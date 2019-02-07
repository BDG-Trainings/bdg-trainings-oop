package com.bdg.aiskandaryan.Lesson_10.Shapes;

public class Square extends Rectangle {
    public Square() {}

    public Square(final double side) {
        super(side, side);
    }

    public Square(final String color, final boolean filled, final double side) {
        super(color, filled, side, side);
    }

    public void setSide(final double side) {
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return width;
    }

    @Override
    public void setLength(final double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(final double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
