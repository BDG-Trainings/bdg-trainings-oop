package shapeandsubclasses;

public class Rectangle extends Shape{
	
		private double length;
		private double width;
		
		public Rectangle() {
			double length = 1.0;
			double width = 1.0;
		}
		public Rectangle (double width, double length) {
			this.width = width;
			this.length = length;
		}
		public Rectangle (double width, double length, String color, boolean filled) {
			super();
			this.width = width;
			this.length = length;
			
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
				
		public double getArea() {
			return length * width;
		}

		public double getPerimeter() {
			return 2*(length + width);
		}
		
		public String toString() {
			   return "Rectangle[length=" + length + " width=" + width + "]";

		} 
		
		public static void main(String[] args) {
			Rectangle rectangleObj = new Rectangle(5, 7);
			System.out.println(rectangleObj.getArea());
			System.out.println(rectangleObj.getPerimeter());
		}
		
		
	}


