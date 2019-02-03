package pointMovablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y,
                        float xSpeed, float ySpeed){
        super.x=x;
        super.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

   public float[] getSpeed() {
        float Speed [] = new float[2];
        Speed[0] = xSpeed;
        Speed[1] = ySpeed;
        return Speed;
    }
    @Override
    public String toString(){
        return "(x, y), speed = (xs, ys)";
    }
    public  MovablePoint move(){
        x+= xSpeed;
        y+= ySpeed;
        return this;
    }
}
