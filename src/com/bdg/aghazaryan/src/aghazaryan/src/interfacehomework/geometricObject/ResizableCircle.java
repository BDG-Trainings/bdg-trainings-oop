package com.bdg.aghazaryan.src.aghazaryan.src.interfacehomework.geometricObject;

public class ResizableCircle extends Circle implements com.bdg.aghazaryan.src.aghazaryan.src.interfacehomework.Resizable {

    public ResizableCircle (double radius) {
        super(radius);

    }
    public double resize(int percent) {
        double resize = radius * (percent / 100);
        return resize;

    }

    public static void main(String args[]) {
        Resizable res = new com.bdg.aghazaryan.src.aghazaryan.src.interfacehomework.ResizableCircle(20);
        System.out.println("Resizable = "+res.resize(50));

    }
}
