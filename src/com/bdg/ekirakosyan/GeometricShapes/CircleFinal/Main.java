package com.bdg.ekirakosyan.GeometricShapes.CircleFinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Radius");

        Scanner r = new Scanner(System.in);
        double radius = r.nextInt();

        CircleFinal c = new CircleFinal(radius, "green");
        System.out.println(c.toString());
        System.out.println(c.getArea());

    }
}
