package com.bdg.spapoyan.ShapeAndSubclasses;

public class Shape {

    private String color = "red";
    private boolean filled = true;

    Shape(){}
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
