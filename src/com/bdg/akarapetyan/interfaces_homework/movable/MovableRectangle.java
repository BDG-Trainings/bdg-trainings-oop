package com.bdg.akarapetyan.interfaces_homework.movable;

public class MovableRectangle extends MovablePoint implements Movable {

    MovablePoint topLeft;
    MovablePoint bootomRight;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        super(x1, y1, xSpeed, ySpeed);
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bootomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft.toString() + "\n" +
                ", bootomRight=" + bootomRight.toString() +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bootomRight.moveUp();;
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bootomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bootomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bootomRight.moveRight();
    }
}
