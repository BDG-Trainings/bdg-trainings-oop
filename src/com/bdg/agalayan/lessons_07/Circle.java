package Lessons_07;

public class Circle {
    private double radius;
    private String color = "white";

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void SetRadius(double radius) {
        this.radius = radius;

    }

    public void SetColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle[radius = " + radius + ", color=" + color + "]";
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public static void main(String []args){
        Circle a = new Circle();
        Circle b = new Circle(2.0);
        Circle c = new Circle(3.0,  "blue");
        System.out.println(a.getArea());
        System.out.println(b.toString());
        System.out.println(c.getRadius() + ", "+ c.getArea() +", "+ c.getColor());
    }
}
