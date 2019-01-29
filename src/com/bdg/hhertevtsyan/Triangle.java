package com.bdg.hhertevtsyan;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle () {
        a = 3;
        b = 3;
        c = 5;
    }

    public Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea () {
        return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
    }
}
