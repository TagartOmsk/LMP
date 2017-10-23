package com.company;
import com.company.Vector3D;

public class Vector3DArray {
    Vector3D[] array;
    public class InequalLengthsOfArrays extends Throwable{
        public InequalLengthsOfArrays() {
        }

        public InequalLengthsOfArrays(String message) {
            super(message);
        }
    }
    public Vector3DArray(int size){
        array=new Vector3D[size];
        for(int i=0;i<size;i++){
            array[i]= new Vector3D();
        }
    }
    public int length(){
        return array.length;
    }
    public void change(int number,Vector3D orig){
        array[number]=new Vector3D(orig.getX(),orig.getY(),orig.getZ());
    }
    public double maxLength(){
        double max=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i].length())max=array[i].length();
        }
        return max;
    }
    public int search(Vector3D orig){
        for(int i=0;i<array.length;i++){
            if(orig.isEqualTo(array[i]))return i;
        }
        return -1;
    }
    public Vector3D arraySum(){
        Vector3D result=new Vector3D();
        for(int i=0;i<array.length;i++){
            result=Vector3DProcessor.sum(result,array[i]);
        }
        return result;
    }
    public Vector3D linearCombination(double[] args)throws InequalLengthsOfArrays{
        if(array.length!=args.length)throw new InequalLengthsOfArrays();
        Vector3D result = new Vector3D();
        for(int i=0;i<array.length;i++){
            result=Vector3DProcessor.sum(result,new Vector3D(
                    args[i]*array[i].getX(),
                    args[i]*array[i].getY(),
                    args[i]*array[i].getZ())
            );
        }
        return result;
    }
    public Point3D[] moveOfPoint(Point3D P){
        Point3D[] result=new Point3D[array.length];
        for(int i=0;i<array.length;i++){
            result[i]=new Point3D(P.getX()+array[i].getX(),P.getY()+array[i].getY(),P.getZ()+array[i].getZ());
        }
        return result;
    }
}


