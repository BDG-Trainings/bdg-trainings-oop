package point2Dpoint3D;

import point2Dpoint3D.Point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super.x = x;
        super.y = y;
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
    public float [] getXYZ(){
        float XYZ[] = new float[3];
        XYZ[0]= x;
        XYZ[1]= y;
        XYZ[2]= z;
        return XYZ;
    }
    @Override
    public String toString(){
        return "(x, y, z)";
    }
}
