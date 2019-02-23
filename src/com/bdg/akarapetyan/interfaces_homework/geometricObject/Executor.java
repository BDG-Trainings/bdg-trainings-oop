package com.bdg.akarapetyan.interfaces_homework.geometricObject;

public class Executor {

    public static void main(String[] args) {

        ResizableCircle circle1 = new ResizableCircle(10.0);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        circle1.resize(2);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
    }
}
