package com.bdg.vqertikyan.point;

public class MainPoint {
    public static void main(String[] args){
        Point2D p2d = new Point2D(5,4);

        for(int i = 0; i<p2d.getXY().length; i++){
            System.out.println(p2d.getXY()[i]);
        };
    }
}
