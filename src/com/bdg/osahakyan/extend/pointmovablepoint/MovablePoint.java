package com.bdg.osahakyan.extend.pointmovablepoint;

public class MovablePoint extends Point {

    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){this.x = x; this.y = y; this.xSpeed = xSpeed; this.ySpeed = ySpeed; }
    public MovablePoint(float xSpeed, float ySpeed){this.xSpeed = xSpeed; this.ySpeed = ySpeed;}
    public MovablePoint(){xSpeed = 0.0f; ySpeed = 0.0f;}

    public float getXSpeed(){return xSpeed;}
    public void setXSpeed(float xSpeed){this.xSpeed = xSpeed;}

    public float getYSpeed(){return ySpeed;}
    public void setYSpeed(float ySpeed){this.ySpeed = ySpeed;}

//    public float Speed(){return xSpeed; ySpeed; }  //?
    public void Speed(float xSpeed, float ySpeed){ this.xSpeed = xSpeed; this.ySpeed = ySpeed;}

    @Override
    public String toString(){return "(" + getX() + "," + getY() + ")" + "speed = (" + getXSpeed() + "," + getYSpeed() + ")"; }

    //?
}
