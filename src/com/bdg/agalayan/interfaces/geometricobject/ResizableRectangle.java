package com.bdg.master.interfaces.geometricobject;


import java.util.EventListener;

public final class ResizableRectangle implements ResizableGeometricObject {


    @Override
    public ResizableGeometricObject resize(final int percent) {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public static void main(String[] args) {
        ResizableRectangle rs = new ResizableRectangle();
        double v = calculateArea(rs);



        GeometricObject [] rss = new GeometricObject[4];

        GeometricObject x = new GeometricObject() {
            @Override
            public double getArea() {
                return 0;
            }
        };

    }

    private static double calculateArea(GeometricObject geometricObject) {

        double area = geometricObject.getArea();
        return 0.0;
    }


    private static void doResize(ResizableRectangle rr) {

    }


}

class ResizeableTriangle implements ResizableGeometricObject {

    @Override
    public ResizableGeometricObject resize(final int percent) {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }
}