package com.company;
import java.util.Scanner;
import com.company.Basic;
import com.company.UnlimitedArrayWorks;


public class Main {




    public static void main(String[] args) {
        double nums[]=new double[3];
        Scanner cin= new Scanner(System.in);
        //nums[0] = cin.nextDouble();
        //nums[1] = cin.nextDouble();
        //nums[2] = cin.nextDouble();
        int x=3,y=7;
        //Basic.FirstTask();
        //Basic.SecondTask(nums);
        //ThirdTask(new int[]{1,2,5});
        //FourthTask(nums[0],nums[1],nums[2]);
        //FifthTask(nums[0],nums[1],nums[2]);
        /*nums=Basic.SixthTask(1,12,13,
                4, 3,1);
        System.out.printf("y= %.5f, x= %.5f\n",nums[1],nums[0]);*/
        //System.out.printf( "%.20f",Basic.SeventhTask(nums[0],nums[1]));

        int[] moreNums=UnlimitedArrayWorks.EnterArray(5);
        UnlimitedArrayWorks.DisplayArray(moreNums);
        //System.out.printf("A sum of array: %d\n",UnlimitedArrayWorks.ArraySum(moreNums));
        //System.out.printf("A number of even numbers: %d\n",UnlimitedArrayWorks.EvensQuantity(moreNums));
        //System.out.printf("A number of numbers within line segment[ %d; %d]: %d\n",x,y,UnlimitedArrayWorks.NumbersWithinSegment(moreNums,x,y));
        //System.out.printf("%b\n",UnlimitedArrayWorks.IsArrayEven(moreNums));
        UnlimitedArrayWorks.DisplayArray(UnlimitedArrayWorks.ReverseArray(moreNums));
    }
}
