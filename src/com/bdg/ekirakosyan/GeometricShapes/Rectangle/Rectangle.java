package com.bdg.ekirakosyan.GeometricShapes.Rectangle;

public class Rectangle {
    float length;
    float width;


    public Rectangle(){

    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength(){
        return this.length;
    }
    public float getWidth(){
        return this.width;
    }
    public void setLength(float length){
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(float length, float width){
        return  width*length;
    }
    public float getPerimeter(float length, float width){
        return 2*width + 2*length;
    }

    @Override
    public String toString() {
        String result = "Rectangle[Length=" + getLength() + ", Width="+getWidth();
        return result;
    }
}
