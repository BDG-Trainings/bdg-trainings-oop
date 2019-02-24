package com.bdg.aghazaryan.src.aghazaryan.src.Interface.geometricObject;

public class Circle implements GeometricObject {

    protected double radius = 1.0;


    public Circle(double radius) {

        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        double area = Math.PI *Math.pow(radius, 2);
        return area;
    }

  /*@Override
  public String toString() {
    return "Circle [getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
  }*/

    public static void main(String args[]) {
        com.bdg.aghazaryan.src.aghazaryan.src.Interface.Circle circ = new com.bdg.aghazaryan.src.aghazaryan.src.Interface.Circle(5);
        System.out.println("Area"  + circ.getArea());
        System.out.println("Perimeter"  + circ.getPerimeter());

    }
}