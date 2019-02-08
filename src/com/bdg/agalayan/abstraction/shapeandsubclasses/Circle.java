package abstraction.shapeandsubclasses;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle (double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*radius*Math.PI;

    }
     @Override
    public String toString(){
        return "Circle [radius ="+ radius + ","+ "color ="+ color+ ","+"filled="+filled+"]";
    }
    public static void main(String[]args){
        Circle c = new Circle(4.0, "red", true);
        System.out.println(c.toString());
        System.out.println("Area circle=" + c.getArea());
    }
}

