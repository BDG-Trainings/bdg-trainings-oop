package com.bdg.spapoyan.Interface;

public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(double radius) {
        super(radius);
    }


    @Override
    public Resizable resize(int percent) {
        return this::resize;
    }
}
