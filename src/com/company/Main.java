package com.company;
import java.util.Scanner;
import com.company.Basic;
import com.company.UnlimitedArrayWorks;
import com.company.Point3D;


public class Main {




    public static void main(String[] args) {
        double nums[]=new double[3];
        Scanner cin= new Scanner(System.in);
        nums[0] = cin.nextDouble();
        nums[1] = cin.nextDouble();
        nums[2] = cin.nextDouble();
        double x=3,y=7;
        Point3D first = new Point3D();
        Point3D second = new Point3D(1,4,-3);
        Point3D third = new Point3D(nums[0],nums[1],nums[2]);
        System.out.printf("%b\n",first==second);
        System.out.printf("%b\n",first==third);
        System.out.printf("%b\n",third==second);
        System.out.printf("%b\n",second==third);
        System.out.printf("%b\n",second==second);
        first.Out();
        second.Out();
        third.Out();
    }
}
