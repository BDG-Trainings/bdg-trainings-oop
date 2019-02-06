package com.bdg.hhertevtsyan.pointmovablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(final float x, final float y, final float xSpeed, final float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint (final float xSpeed, final float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint () {}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed () {
        float [] spd = new float [2];
        spd[0] = xSpeed;
        spd[1] = ySpeed;
        return spd;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")" + ", speed = (" + xSpeed + "," + ySpeed + ")";
    }

    public MovablePoint move () {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
