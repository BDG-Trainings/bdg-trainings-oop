package com.bdg.aiskandaryan.Lesson_11.Points;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2D() {}

    public Point2D(final float x, final float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(final float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(final float y) {
        this.y = y;
    }

    public float [] getXY() {
        float [] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public void setXY(final float x, final float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
