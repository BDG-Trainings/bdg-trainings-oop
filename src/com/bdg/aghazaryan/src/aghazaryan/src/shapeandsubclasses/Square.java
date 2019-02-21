package shapeandsubclasses;

public class Square extends Rectangle{

	public Square() {
		super();
}

	public Square (double side) {
		super (side, side);
	}
	public Square(double side, String color, boolean filled ) {
		 super();
	}
	public double getSide() {
		return getSide();
		
	}
	public void setSide(double side) {
		 this.getSide();
	}
	
	public void setWidth(double side) {
		
	}
    public void setLength(double side) {
		
	}
    public String toString() {
		return "Square [getSide()=" + getSide() + ", toString()=" + super.toString() + "]";

    }
	
	public static void main(String[] args) {
		Square squareObj = new Square(88);
		System.out.println(squareObj.getArea());
		System.out.println(squareObj.getPerimeter());
}
}