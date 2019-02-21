package com.bdg.master.movable;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint centr;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){

        this.centr.x = x;
        this.centr.y = y;

        this.centr.xSpeed = xSpeed;
        this.centr.ySpeed = ySpeed;

        this.radius = radius;
    }

    @Override
    public void moveUp(int y) {
        centr.y = centr.y + y;
    }

    @Override
    public void moveDown(int y) {
        centr.y = centr.y - y ;
    }

    @Override
    public void moveLeft(int x) {
            centr.x = centr.x -x;
    }

    @Override
    public void moveRight(int x) {
        centr.x = centr.x + x;
    }

    public void setCentr(MovablePoint centr) {
        this.centr = centr;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public MovablePoint getCentr() {
        return centr;
    }



    @Override
    public String toString() {
        return "MovableCircle{" +
                "x:" +'\'' + centr.x +'\''+
                "y:" +'\'' + centr.y +'\''+
                "xSpeed:"+'\'' + centr.xSpeed+'\'' +
                "ySpeed:"+ '\''+ centr.ySpeed+'\'' +
                "radius" + '\'' +radius + '\'' +
                "}";
    }
}
