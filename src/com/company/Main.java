package com.company;
import java.util.Scanner;
import com.company.Basic;
import com.company.UnlimitedArrayWorks;
import com.company.Point3D;
import com.company.Vector3D;


public class Main {




    public static void main(String[] args) {
        double nums[]=new double[3];
        Scanner cin= new Scanner(System.in);
        nums[0] = cin.nextDouble();
        nums[1] = cin.nextDouble();
        nums[2] = cin.nextDouble();
        double x=3,y=7;
        Point3D first = new Point3D(0,0,0);
        Point3D second = new Point3D(nums[0],nums[1],nums[2]);
        Vector3D PerpetualBlackFirst = new Vector3D(first,second);
        Vector3D PerpetualBlackSecond = new Vector3D(1,2,2);
        System.out.printf("%b\n",PerpetualBlackFirst.isEqualTo(PerpetualBlackSecond));
    }
}
