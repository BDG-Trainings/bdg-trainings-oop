package com.bdg.aghazaryan.src.aghazaryan.src.interfacehomework.movable;

public class MovablePoint implements Movable {

    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {

        y -= ySpeed;
    }


    public void moveDown() {
        y += ySpeed;

    }

    public void moveLeft() {

        x -= xSpeed;
    }

    public void moveRight() {

        x += xSpeed;
    }

    public static void main(String args[]) {
        MovablePoint moveObj = new MovablePoint(5, 6, 8, 8);
        System.out.println("moveObj.moveUp(5)");
        moveObj.moveUp();
        System.out.println("moveObj.moveDown(6)");
        moveObj.moveDown();
        System.out.println("moveObj.moveLeft(4)");
        moveObj.moveLeft();
        System.out.println("moveObj.moveRight(4)");
        moveObj.moveRight();
    }
}