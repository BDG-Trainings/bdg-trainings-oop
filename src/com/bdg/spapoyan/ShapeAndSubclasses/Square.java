package com.bdg.spapoyan.ShapeAndSubclasses;

public class Square extends Rectangle {


    private double side = 1.0;


    public Square(){}


    public Square(double side){
        this.side = side;
    }

    public Square (double side, String color, boolean filled){
        this.side = side;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
