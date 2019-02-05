package pointmovablepoint;

public class MovablePoint extends Point {

	private float xSpeed;
    private float ySpeed;
    
    public MovablePoint ( float x, float y, float xSpeed, float ySpeed ) {
    	super();
    	this.xSpeed = xSpeed;
    	this.ySpeed = ySpeed;
    }
   public MovablePoint ( float xSpeed, float ySpeed ) {
	   this.xSpeed = xSpeed;
   	   this.ySpeed = ySpeed;
    }
   public MovablePoint () {
}

   public float getXSpeed() {
	   return this.xSpeed;
   }	
   public void setXSpeed (float xSpeed) {
	   this.xSpeed = xSpeed;
}
   public float getYSpeed() {
	   return this.ySpeed;
   }	
   public void setYSpeed (float ySpeed) {
	   this.ySpeed = ySpeed;
}
   
   public void getSpeed(float xSpeed, float ySpeed)  {
	   this.xSpeed = xSpeed;
	   this.ySpeed = ySpeed;
   }
   
   public float[] getSpeed() {
	   float[] results  = new float[2];
	   results [0]= this.xSpeed;
	   results [1] =this.ySpeed;
		 return results;
			
   }
   
   public String toString() {
	      return "Point(" + getX() + " , " + getY() + "), speed=( "  + xSpeed + " , " + ySpeed + ")";

   }
   public MovablePoint move() {
	   setX(getX() + xSpeed);
	   setY(getY() + ySpeed);
	   return move(); // I guess smth is wrong with this section
   }
   
   public static void main(String[] aegs) {
	   MovablePoint MovablePointObj = new MovablePoint();
	   MovablePointObj.setX(5);
	   MovablePointObj.setY(9);
	   MovablePointObj.setXSpeed(130);
	   MovablePointObj.setYSpeed(180);
	   System.out.println(" x is: " + MovablePointObj.getX());
	   System.out.println(" y is: " + MovablePointObj.getY());	 
	   System.out.println(" xSpeed is: " + MovablePointObj.getXSpeed());
	   System.out.println(" ySpeed is: " + MovablePointObj.getYSpeed());
	   System.out.println(MovablePointObj);
	  // System.out.println(MovablePointObj.move()); //Throws an error
	   
	 
   }
   }