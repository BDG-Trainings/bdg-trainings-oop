package com.bdg.aghazaryan.src.aghazaryan.src.interfacehomework.movable;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed ) {

        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

    }

    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    @Override
    public void moveUp() {


    }

    @Override
    public void moveDown() {


    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {


    }


    public static void main(String args[]) {
        MovableRectangle rectangle = new MovableRectangle(2, 2, 8, 8, 10, 10);
        System.out.println("rectangle.moveUp(2)");
        rectangle.moveUp();
        System.out.println("rectangle.moveDown(2)");
        rectangle.moveDown();
        System.out.println("rectangle.moveLeft(8)");
        rectangle.moveLeft();
        System.out.println("rectangle.moveRight(8)");
        rectangle.moveRight();

    }
}
