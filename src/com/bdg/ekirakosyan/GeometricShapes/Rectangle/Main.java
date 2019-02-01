package com.bdg.ekirakosyan.GeometricShapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 9);
        System.out.println(rec.toString());
        System.out.println(rec.getPerimeter(2,3));
        System.out.println(rec.getArea(2,4));
    }
}
