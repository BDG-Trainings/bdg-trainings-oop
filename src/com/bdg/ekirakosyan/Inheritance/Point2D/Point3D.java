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

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        float[] xyz = new float[3];
        xyz[0] = x;
        xyz[1] = y;
        xyz[2] = z;

        return xyz;
    }


    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y" + y +
                ", z=" + z +
                '}';
    }
}
