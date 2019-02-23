package com.bdg.akarapetyan.interfaces_homework;

public class ResizableCircle extends Cicrcle implements Resizable{

    private double radius;
    private int percent;

    public ResizableCircle(double radius) {
        super(radius);
    }

    public ResizableCircle(double radius, double radius1, int percent) {
        super(radius);
        this.radius = radius1;
        this.percent = percent;
    }

    @Override
    public void resize(int percent) {

    }
}
