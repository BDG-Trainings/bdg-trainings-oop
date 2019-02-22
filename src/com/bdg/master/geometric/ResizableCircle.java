package com.bdg.master.geometric;

public class ResizableCircle extends Circle implements Resazable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public int resize(int percent) {
        return 0;
    }
}
