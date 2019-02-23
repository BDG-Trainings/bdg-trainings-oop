package com.bdg.akarapetyan.interfaces_homework.geometricObject;

public class ResizableCircle extends Cicrcle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        super.radius = radius*percent;
    }
}
