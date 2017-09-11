package com.company;
import java.util.Scanner;
import com.company.Basic;


public class Main {




    public static void main(String[] args) {
        double nums[]=new double[3];
        Scanner cin= new Scanner(System.in);
        nums[0] = cin.nextDouble();
        nums[1] = cin.nextDouble();
        nums[2] = cin.nextDouble();
        double x=0,y=0;
        com.company.Basic.FirstTask();
        com.company.Basic.SecondTask(nums);
        //ThirdTask(new int[]{1,2,5});
        //FourthTask(nums[0],nums[1],nums[2]);
        //FifthTask(nums[0],nums[1],nums[2]);
        /*SixthTask(10,12,0,
                4, 11,0,x,y);
        System.out.printf("y= %.5f, x= %.5f\n",y,x);*/
        System.out.printf( "%.20f",com.company.Basic.SeventhTask(nums[0],nums[1]));

    }
}
