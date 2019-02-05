package Inheritance.Point2D;

public class Point3D extends Point2D{

    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){}
    //public float getXYZ(){}


    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y" + y +
                ", z=" + z +
                '}';
    }
}
