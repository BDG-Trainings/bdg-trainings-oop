package com.bdg.osahakyan.extend.point2dpoint3d;

public class Point3D extends Point2D {

    private float z;

    public Point3D(float x, float y, float z){this.x = x; this.y = y; this.z = z;}
    public Point3D(){x = 0.0f; y = 0.0f; z =0.0f}

    public float getZ(){return z;}
    public void setZ(float z){this.z = z;}

    public float getXYZ(){return x; y; z; }  //?
    public void setXYZ(float x, float y, float z){ this.x = x; this.y = y; this.z = z;}

    @Override
    public String toString(){return "(" + getX() + "," + getY() + "," + getZ() +  ")"; }
}
