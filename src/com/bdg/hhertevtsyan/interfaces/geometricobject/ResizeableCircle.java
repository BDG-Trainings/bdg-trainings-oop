package com.bdg.hhertevtsyan.interfaces.geometricobject;

public class ResizeableCircle extends Circle implements Resizable {

    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius = radius / 100 * percent;
    }
}
