package pointmovablepoint;

import java.util.Arrays;

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
   
   
   public MovablePoint move() {
       setX(getX() + xSpeed);
       setY(getY() + ySpeed);
       return this;
     }
     
   @Override
  public String toString() {
    return "MovablePoint [getSpeed()=" + Arrays.toString(getSpeed()) + ", toString()=" + super.toString() + " =  (xs, xy)]";
    
  }
     
  public static void main(String[] args) {
       MovablePoint MovablePointObj = new MovablePoint();
       MovablePointObj.setX(5);
       MovablePointObj.setY(9);
       MovablePointObj.setXSpeed(130);
       MovablePointObj.setYSpeed(180);
       System.out.println(MovablePointObj);
       System.out.println(MovablePointObj.move());
  }
  
     }