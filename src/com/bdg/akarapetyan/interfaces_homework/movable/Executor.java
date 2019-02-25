package com.bdg.akarapetyan.interfaces_homework.movable;

public class Executor {

    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(1,1,2,2);
        System.out.println(movablePoint.toString());
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint.toString());
        System.out.println();

        MovableCircle movableCircle1 = new MovableCircle(2,2,3,3);
        System.out.println(movableCircle1.toString());
        movableCircle1.moveDown();
        movableCircle1.moveLeft();
        System.out.println(movableCircle1.toString());
        System.out.println();

        MovableCircle movableCircle2 = new MovableCircle(11,11,5,5);
        System.out.println(movableCircle2.toString());
        movableCircle2.moveDown();
        movableCircle2.moveLeft();
        System.out.println(movableCircle2.toString());

    }
}
