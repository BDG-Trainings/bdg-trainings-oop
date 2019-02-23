package com.bdg.spapoyan.Interface.Movable;

public class MovableCircle extends MovablePoint implements Movable {

    int radius;
    MovablePoint center;

    public MovableCircle(final int x, final int y, final int xSpeed, final int ySpeed, final int radius) {
        super(x, y, xSpeed, ySpeed);
        this. radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
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
}
