package point2dpoint3d;

public class Point3D extends Point2D {

	private float z = 0.0f;
	
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z = z;
	}
	public Point3D() {
		
	}
	
	public float getZ() {
		return this.z;
	}
	public void setZ(float z) {
		this.z = z;

}
    public void setXYZ(float x, float y, float z) {
	
	}
    public float[] getXY () {
		float[] results = new float[3];
	     results[2]= this.z;
		 return results;
				
	}
	
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";		
	}
	
	public static void main(String[] args) {
	Point3D Point3Obj = new Point3D ();
        
     Point3Obj.setX(21);  
     Point3Obj.setY(22);  
     Point3Obj.setZ(23); 
     System.out.println("x is: " + Point3Obj.getX());  
     System.out.println("y is: " + Point3Obj.getY());  
     System.out.println("z is: " + Point3Obj.getZ()); 

	}

}
	