package com.bdg.agalayan.lessons_07;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){ this.width = width; }
    public int getArea(){  return length*width; }
    public String toString(){
        return "Rectangle [length= " + length+  ", "+ "width"+ width + "]";
    }
    public static void main (String [] args){
        Rectangle a = new Rectangle(2,3);
        System.out.println(a.toString());
        System.out.println("Makeres@ = " + a.getArea());
    }
}
