package com.bdg.agalayan.lessons_07;

public class Circle1 {
    private double radius= 1.0;
    public Circle1(){
    }
    public Circle1(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void SetRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "Cirkle [radius = " + radius + "]";
    }
    public static void main(String [] args){
        Circle1 X = new Circle1(10.0);
        Circle1 Y = new Circle1();
        System.out.println(X.getArea());
        System.out.print(Y.getCircumference());

    }
}
