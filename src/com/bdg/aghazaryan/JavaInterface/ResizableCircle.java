package com.bdg.aghazaryan.JavaInterface;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle (double radius) {
        super(radius);

    }
    public double resize(int percent) {
        double resize = radius * (percent / 100);
        return resize;

    }

    public static void main(String args[]) {
        Resizable res = new ResizableCircle(20);
         System.out.println("Resizable = "+res.resize(50));


    }
}
