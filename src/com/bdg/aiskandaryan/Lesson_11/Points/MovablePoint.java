package com.bdg.aiskandaryan.Lesson_11.Points;

public class MovablePoint extends Point2D {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(final float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(final float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed() {
        float [] speed = new float[2];
        speed[0] = xSpeed;
        speed[1] = ySpeed;
        return speed;
    }

    public void setSpeed(final float xSpeed, final float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint[" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + ySpeed +
                ", ySpeed=" + ySpeed +
                ']';
    }

    public MovablePoint move() {
        x += xSpeed;
        y = ySpeed;
        return this;
    }
}
