package com.company;
import com.company.Vector3D;

public class Vector3DProcessor {
    public static Vector3D sum(Vector3D A, Vector3D B){
        return new Vector3D(A.getX()+B.getX(),A.getY()+B.getY(),A.getZ()+B.getZ());
    }

    public static Vector3D difference(Vector3D A, Vector3D B){
        return new Vector3D(A.getX()-B.getX(),A.getY()-B.getY(),A.getZ()-B.getZ());
    }
    public static double scalarMultiplication(Vector3D A, Vector3D B){
        return (A.getX()*B.getX()+A.getY()*B.getY()+A.getZ()*B.getZ());
    }
    public static Vector3D vectorMultiplication(Vector3D A, Vector3D B){
        return new Vector3D(
                A.getY()*B.getZ()-A.getZ()*B.getY(),
                A.getZ()*B.getX()-A.getX()*B.getZ(),
                A.getX()*B.getY()-A.getY()*B.getX()
        );
    }
    public static boolean isCollinear(Vector3D A, Vector3D B){
        Vector3D res = vectorMultiplication(A,B);
        if(res.getX()==0 && res.getY()==0 && res.getZ()==0)return true;
        else return false;
    }
}
/*if(B.getX()==0){
            if(A.getX()==0){
                coefY=A.getY()/B.getY();
                coefZ=A.getZ()/B.getZ();
                if(coefY==coefZ)return true;
                else return false;
            }else return false;
        }
        if(B.getY()==0){
            if(A.getY()==0){
                coefX=A.getX()/B.getX();
                coefZ=A.getZ()/B.getZ();
                if(coefX==coefZ)return true;
                else return false;
            }else return false;
        }
        if(B.getZ()==0){
            if(A.getZ()==0){
                coefX=A.getX()/B.getX();
                coefY=A.getY()/B.getY();
                if(coefX==coefY)return true;
                else return false;
            }else return false;}*/
/*public static boolean isCollinear(Vector3D A, Vector3D B) {
        if (B.getX() == 0) {
            if(A.getX() == 0){
                if(B.getY() == 0){
                    if(A.getY() == 0){
                        if(B.getZ() == 0){
                            return true;
                        }
                    }else return false;
                }else{
                    if(B.getZ() != 0){
                        if((A.getY()/B.getY())==(A.getZ()/B.getZ()))return true;
                        else return false;
                    }else{
                        if(A.getZ()==0)return true;
                        else return false;
                    }
                }
            }else return false;
        }else{
            if(B.getY()==0){
                if(A.getY()==0){
                    if(B.getZ()==0){
                        if(A.getZ()==0)return true;
                        else if((A.getX()/B.getX())==(A.getZ()/B.getZ()))return true; else return false;
                    }
                }else return false;
            }else{
                if(B.getZ()==0){
                    if(A.getZ()==0)return true; else return false;
                }else{
                    if((A.getY()/B.getY())==(A.getZ()/B.getZ())&&(A.getY()/B.getY())==(A.getX()/B.getX())&&(A.getX()/B.getX())==(A.getZ()/B.getZ()))return true;
                    else return false;
                }
            }
        }
    return false;}*/