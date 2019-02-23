package com.bdg.spapoyan.Interface;

public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(double radius) {
        super(radius);
    }


    @Override
    public double resize(int percent) {
        return this.radius = radius / 100 * percent;
    }
}
