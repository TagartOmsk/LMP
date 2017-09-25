package com.company;
import java.util.Scanner;
import com.company.Basic;
import com.company.UnlimitedArrayWorks;
import com.company.Point3D;
import com.company.Vector3D;


public class Main {




    public static void main(String[] args) {
        double nums[]=new double[6];
        Scanner cin= new Scanner(System.in);
        nums[0] = cin.nextDouble();
        nums[1] = cin.nextDouble();
        nums[2] = cin.nextDouble();
        nums[3] = cin.nextDouble();
        nums[4] = cin.nextDouble();
        nums[5] = cin.nextDouble();
        double x=3,y=7;
        //Point3D first = new Point3D(0,0,0);
        //Point3D second = new Point3D(nums[0],nums[1],nums[2]);
        Vector3D PerpetualBlackFirst = new Vector3D(nums[0],nums[1],nums[2]);
        Vector3D PerpetualBlackSecond = new Vector3D(nums[3],nums[4],nums[5]);
        System.out.printf("%b",Vector3DProcessor.isCollinear(PerpetualBlackFirst,PerpetualBlackSecond));

    }
}
