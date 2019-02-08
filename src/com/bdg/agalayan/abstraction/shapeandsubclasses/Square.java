package abstraction.shapeandsubclasses;

public class Square extends Rectangle {


    public Square(){

    }
    public Square(double side){


    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);

    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);

    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public double getArea(){
        return super.getLength()*super.getWidth();
    }

    @Override
    public double getPerimeter(){
        return 2*(super.getLength()*super.getWidth());
    }

    @Override
    public  String toString() {
        return "Square [side="+ getSide() + "]";
    }

    public static void main(String[]args){
        Square s = new Square( 2.0, "green", true);
        System.out.println(s.toString());
        System.out.println("Area square=" + s.getArea());
    }
}
