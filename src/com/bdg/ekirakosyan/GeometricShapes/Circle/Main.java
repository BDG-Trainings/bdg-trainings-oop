package com.bdg.ekirakosyan.GeometricShapes.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Radius");

        Scanner r = new Scanner(System.in);
        double radius = r.nextInt();

        Circle circle = new Circle(radius);
        System.out.println(circle.toString());

        System.out.println("Circle Area is: " + circle.getArea());
        System.out.println("Circumference is: " + circle.getCircumference());
    }
}
