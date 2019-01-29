package com.bdg.hhertevtsyan;

public class TrianglePyramid {
    private Triangle triangle;
    private double h;

    public TrianglePyramid (Triangle triangle, double h) {
        this.triangle =triangle;
        this.h = h;
    }

    public double getVolume () {
        return (triangle.getArea()*h)/3;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4,4,7);
        TrianglePyramid pyramid = new TrianglePyramid(triangle, 5);
        System.out.println("Volume =" + pyramid.getVolume());
    }
}
