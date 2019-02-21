package com.bdg.master.movable;

public class App {
    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(5,15,3,4);
        MovableCircle circle = new MovableCircle(20,20,20,20,15);

        System.out.println(point.toString());
        System.out.println(circle.toString());
    }
}
