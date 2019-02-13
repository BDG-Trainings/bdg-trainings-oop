package Inheritance.Shape;

public class Square extends Rectangle {

    private double side;

    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
