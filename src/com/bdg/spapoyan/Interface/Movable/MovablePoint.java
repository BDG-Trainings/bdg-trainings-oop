package com.bdg.spapoyan.Interface.Movable;

public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(final int x, final int y, final int xSpeed, final int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() { y = y + ySpeed; }

    @Override
    public void moveDown() { y = y - ySpeed; }

    @Override
    public void moveLeft() { x = x - xSpeed; }

    @Override
    public void moveRight() { x = x + xSpeed; }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
