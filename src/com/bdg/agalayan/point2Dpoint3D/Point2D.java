package point2Dpoint3D;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point2D(){

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
    public void setXY(float x, float y){
        this.x= x;
        this.y = y;
    }
    public float [] getXY(){
        float XY [] = new float [2];
        XY[0]= x;
        XY[1]=y;
        return XY;

    }
    public String toString(){
        return "(x, y)";
    }
}
