package Lessons_08;

import Lessons_07.Circle1;

public class Bowl {
    private Circle1 circle;

    public Bowl(double radius){
        circle = new Circle1(radius);
    }
    public double getRadius(){
        return circle.getRadius();
    }
    public void setRadius(double radius){
        circle.SetRadius(radius);
    }
    public double getVolume(){
        return circle.getArea()*4/3*circle.getRadius();
    }
    public String toString(){
        return "Bowl [radius = " + circle.getRadius();
    }
    public  static void  main(String []args){
        Bowl gund = new Bowl(6.0);
        System.out.println(gund.toString());
        System.out.println("Caval@+ " + gund.getVolume());

    }
}
