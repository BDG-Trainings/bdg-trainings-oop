package com.bdg.osahakyan.extend.shapeandsubclasses;

public class Shape {

    protected String color;
    protected boolean filled;

    public Shape(){color = "red"; filled = true;}
    public Shape(String color, boolean filled){this.color = "red"; this.filled = true;}

    public String getColor(){return color;}
    public void setColor(String color ){this.color = color;}

    public boolean isFilled(){return filled;}
    public void setFilled(boolean filled) {this.filled = filled;}

    @Override
    public String toString() { return "Shape (" + getColor() + "," + isFilled()+ ")";}

}
