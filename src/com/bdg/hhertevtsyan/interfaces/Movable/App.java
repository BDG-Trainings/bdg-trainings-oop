package com.bdg.hhertevtsyan.interfaces.Movable;

public class App {

    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(2,3,1,1,4);
        movableCircle.moveDown();

        MovableRectangle movableRectangle = new MovableRectangle(1,1,4,4,2,3);
        System.out.println(movableRectangle.toString());

        movableRectangle.moveDown();

        System.out.println(movableRectangle.toString());


        //System.out.println(movableCircle.toString());
    }
}
