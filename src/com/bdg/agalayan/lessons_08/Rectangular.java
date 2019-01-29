package com.bdg.agalayan.lessons_08;

import com.bdg.agalayan.lessons_07.Rectangle;

public class Rectangular {
    private int depth;
    private Rectangle rectangle;

    public Rectangular(int length, int width, int depth) {
        this.depth = depth;
        rectangle = new Rectangle(2, 3);
    }

    public int getLength() {
        return rectangle.getLength();
    }

    public int getWidth() {
        return rectangle.getWidth();
    }

    public int getDepth() {
        return depth;
    }

    public void setLength(int length) {
        rectangle.setLength(length);
    }

    public void setWidth(int width) {
        rectangle.setWidth(width);
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public int getVolume() {
        return rectangle.getArea() * depth;
    }
    public String toString() {
        return "Rectanguler [length= " + rectangle.getLength() + ", " + "width=" + rectangle.getWidth() +
                "," + "depth=" + depth + "]";
    }
    public static void main(String[] args) {
        Rectangular a = new Rectangular(2, 3,4);
        System.out.println(a.toString());
        System.out.println("Caval@ = " + a.getVolume());
    }
}
