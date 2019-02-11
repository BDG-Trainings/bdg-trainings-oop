package com.bdg.spapoyan;

import java.awt.*;

public class TestCircle {
    public static void main (String[]args){
        Circle c1 = new Circle();
        System.out.println("The circle has radius of = " + c1.getRadius()
                + ", And area of = " + c1.getArea());
        System.out.println(c1.toString());

        }
    }

