package com.bdg.hhertevtsyan.interfaces.Movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(final int x, final int y, final int xSpeed, final int ySpeed, final int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "Circle radius = " + radius + ", Current circle center coordinates [ x = " + center.x + ", y = " + center.y + "]," + " Circle vertical move speed = " + center.ySpeed + ", Circle horizontal move speed = " + center.xSpeed;
    }
}
