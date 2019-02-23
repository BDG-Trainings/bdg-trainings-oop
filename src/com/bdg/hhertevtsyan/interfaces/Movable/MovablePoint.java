package com.bdg.hhertevtsyan.interfaces.Movable;

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
    public void moveUp() {
        this.y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        this.y = y - ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = x + xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = x - xSpeed;
    }

    @Override
    public String toString() {
        return "Current point coordinates [ x = " + x + ", y = " + y + "]," + " Point vertical move speed = " + ySpeed + ", Point horizontal move speed = " + xSpeed;
    }
}
