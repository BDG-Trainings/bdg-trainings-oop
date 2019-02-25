package com.bdg.agalayan.Interfacees.Geometric;

public class Circle implements GeometricObject {
    public  double radius=1.0;

   public Circle(double radius){
       this.radius=radius;
   }
    @Override
    public double getPerimeter() {
        return 2* radius* Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
