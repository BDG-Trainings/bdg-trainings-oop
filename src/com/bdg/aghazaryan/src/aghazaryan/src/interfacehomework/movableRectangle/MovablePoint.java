package com.bdg.aghazaryan.src.aghazaryan.src.interfacehomework.movableRectangle;

public class MovablePoint implements Movable {

    int x1, y1, x2, y2, xSpeed, ySpeed;

    public MovablePoint(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y1 -= ySpeed;
        y2 -= ySpeed;
    }

    public void moveDown() {
        y1 += ySpeed;
        y2 += ySpeed;

    }

    public void moveLeft() {
        x1 -= xSpeed;
        x2 -= xSpeed;
    }

    public void moveRight() {
        x1 += xSpeed;
        x2 += xSpeed;
    }
        public static void main (String args[]){
            MovablePoint moveObj1 = new MovablePoint(5, 6, 7, 8, 9, 10);
            System.out.println("moveObj.moveUp()");
            moveObj1.moveUp();
            System.out.println("moveObj.moveDown()");
            moveObj1.moveDown();
            System.out.println("moveObj.moveLeft()");
            moveObj1.moveLeft();
            System.out.println("moveObj.moveRight()");
            moveObj1.moveRight();
        }
    }
