package circlecylinder;

public class Cylinder extends Circle{

	private double height = 1.0;
	
	public Cylinder() {
		super();
		height = 1.0;		
	}
		public Cylinder (double radius) {
		super();
		this.height = radius;
	}
	public Cylinder (double radius, double height, String color) {
}
	public double getHeight() {
		return height;
	}
	
	public void setHeight( double height) {
		this.height = height;
	}
    public double getVolume() {
    	return getArea()*height;     
    	}
    public static void main (String[] args) {
		   Cylinder cObj = new Cylinder(6.0);
		      System.out.println("Cylinder:"
		            + " radius = " + cObj.getRadius()
		            + " height = " + cObj.getHeight()
		            + " base area = " + cObj.getArea()
		            + " volume = " + cObj.getVolume()
                + " color = " + cObj.getColor());
}
}

	
