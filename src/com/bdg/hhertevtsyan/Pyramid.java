package com.bdg.hhertevtsyan;

public class Pyramid {
    private Rectangle rectangle;
    private double h;

    public Pyramid(Rectangle rectangle, double h) {
        this.rectangle = rectangle;
        this.h = h;
    }

    public double getVolume () {
        return rectangle.getArea()*h/3;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Pyramid pyramid = new Pyramid(rectangle, 5);
        System.out.println("Volume = " + pyramid.getVolume());
    }
}
