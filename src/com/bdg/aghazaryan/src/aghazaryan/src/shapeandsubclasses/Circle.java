package shapeandsubclasses;

public class Circle extends Shape {

		private double radius;
			
		public Circle() {
		 radius = 1.0;
		
	}
		public Circle(double radius) {
			this.radius = radius;	
		}
		public Circle(double radius, String color, boolean filled) {
			super();
			this.radius = radius;;
			
		}
		
		public double getRadius() {
		return this.radius;
	}
		public void setRadius(double radius) {
			this.radius = radius;
			
		}
			public double getArea() {
			return radius * radius * Math.PI;
		}
			public double getPerimeter() {
				return 2*Math.PI*getRadius();
			}
		public String toString() {
	        return "Circle[radius=" + getRadius() + "," + "color=" + getColor() + "," +  "Area=" + getArea() + "]";

		}
		public static void main (String [] args) {
			Circle circleObj = new Circle ();
			System.out.println(circleObj);

	}

}