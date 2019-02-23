package com.bdg.hhertevtsyan.interfaces.Movable;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint topRight;

    public MovableRectangle(final int x1, final int y1, final int x2, final int y2, final int xSpeed, final int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.topRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        topRight.moveDown();
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        topRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topRight.moveRight();
        topLeft.moveRight();
    }

    @Override
    public String toString() {
        return "Rectangle top left corner coordinates [ x = " + topLeft.x + ", y = " + topLeft.y + "]," +
                "Rectangle top right corner coordinates [ x = " + topRight.x + ", y = " + topRight.y + "]," +
                "Rectangle vertical move speed = " + topRight.ySpeed + "," +
                "Rectangle horizontal move speed = " + topRight.xSpeed + ",";
    }
}
