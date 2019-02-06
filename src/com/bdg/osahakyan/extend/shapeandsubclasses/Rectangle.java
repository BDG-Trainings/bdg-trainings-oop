package com.bdg.osahakyan.extend.shapeandsubclasses;

public class Rectangle extends Shape {

    protected float length;
    protected float width;

    public Rectangle (){length = 1.0f; width = 1.0f; }
    public Rectangle (float length, float width){this.length = length;this.width = width; }
    public Rectangle (float length, float width, String color, boolean filled){this.length = length; this.width = width;
      this.color = color; this.filled = filled; }

    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }

    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }

    public double getArea (){
        return length * width;
    }
    public double getPerimeter (){
        return (length + width) * 2;
    }

    public String toString (){
        return "Length ( " + getLength() + ", Width " + getWidth() + ")";
    }

}

