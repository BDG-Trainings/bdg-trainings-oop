package point2dpoint3d;

public class Point2D {
 
	private float x;
	private float y;
	
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public Point2D() {
}

	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setXY(float x, float y) {
		
	}
	
	public float[] getXY () {
		float[] results = new float[2];
		results[0] = this.x;
		results[1]= this.y;
		return results;
				
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
		
	}
	public static void main (String[] args) { 
		Point2D point2Obj = new Point2D();
		point2Obj.setX(5);
		System.out.println(point2Obj.getX());
		point2Obj.setY(6);
		System.out.println(point2Obj.getY());
				
	}
	}