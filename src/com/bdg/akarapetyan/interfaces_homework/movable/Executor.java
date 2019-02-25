package com.bdg.akarapetyan.interfaces_homework.movable;

public class Executor {

    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(1,1,2,2);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint.toString());

    }
}
