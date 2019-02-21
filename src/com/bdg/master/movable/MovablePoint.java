package com.bdg.master.movable;

public class MovablePoint implements Movable {

    protected int x;
    protected int y;

    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
            this.x = x;
            this.y = y;

            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp(int y) {
        this.y = this.y + y;
        this.ySpeed = this.ySpeed + y;
    }

    @Override
    public void moveDown(int y) {
            this.y = this.y - y;
            this.ySpeed = this.ySpeed - y;
    }

    @Override
    public void moveLeft(int x) {
        this.x = this.x - x;
        this.xSpeed = this.xSpeed - x;
    }

    @Override
    public void moveRight(int x) {
        this.x = this.x + x;
        this.xSpeed = this.xSpeed + x;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getY() {
        return y;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint {"+
                    "x:" + '\''+ x +'\'' + "," +
                    "y:" + '\'' + y + '\'' + "," +
                    "xSpeed:" + '\'' + xSpeed + '\'' + "," +
                    "ySpeed:" + '\'' + ySpeed + '\'' +
                "}";
    }
}
