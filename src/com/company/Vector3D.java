package com.company;
import com.company.Point3D;

public class Vector3D {
    private double x,y,z;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D(){
        this.x=0;
        this.y=0;
        this.z=0;
    };
    public Vector3D(double x,double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Vector3D(Point3D A,Point3D B){
        this.x=B.getX()-A.getX();
        this.y=B.getY()-A.getY();
        this.z=B.getZ()-A.getZ();
    }
    public double length(){
        return Math.sqrt((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));
    }
    public boolean isEqualTo(Vector3D comp){
        return ((this.x==comp.x)&&(this.y==comp.y)&&(this.z==comp.z));
    }
}
