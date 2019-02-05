package pointmovablepoint;

public class Point {
	
	private float x;
	private float y;
	
	public Point (float x, float y) {
		this.x = 0.0f;
		this.y = 0.0f;
	}
	
	public Point () {
		this.x = 0.0f;
		this.y = 0.0f;
	}
    public float getX() {
    	return this.x;
    }
    public void setX (float x) {
    	this.x = x;
    }
    public float getY() {
    	return this.y;
}
    public void setY (float y) {
    	this.y = y;
}
    public void setXY (float x, float y) {
    	this.x = x;
    	this.y = y;
    	
    }  
    
        	public float[] getXY () {
    		float[] results = new float[2];
    		results[0] = this.x;
    		results[1]= this.y;
    		return results;
    				
    	}
	
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";		
	}
	public static void main (String[] args) {
		Point PointObj = new Point();
		PointObj.setX(2.0f);
		PointObj.setY(5.0f);
		System.out.println(PointObj.getX());
		System.out.println(PointObj.getY());
	
	}
}