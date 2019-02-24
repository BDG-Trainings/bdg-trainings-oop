package com.bdg.spapoyan.Interface.Movable;

public class MovableCircle extends MovablePoint implements Movable {

    int radius;
    MovablePoint center;

    public MovableCircle(final int x, final int y, final int xSpeed, final int ySpeed, final int radius) {
        super(x, y, xSpeed, ySpeed);
        this. radius = radius;
    }

    @Override
    public void moveUp() { center.moveUp(); }

    @Override
    public void moveDown() { center.moveDown(); }

    @Override
    public void moveLeft() { center.moveLeft(); }

    @Override
    public void moveRight() { center.moveRight(); }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                ", x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
