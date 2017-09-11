package com.company;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void FirstTask() {
        System.out.println("Hello, World!");
    }

    public static void SecondTask(double[] nums){
        System.out.println((nums[0]+nums[1]+nums[2])/3);
        System.out.println(nums[0]*nums[1]*nums[2]);
        Arrays.sort(nums);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
    }

    public static void ThirdTask(int[] nums) {
        System.out.println((nums[0]+nums[1]+nums[2])/3.0);
        System.out.println(nums[0]*nums[1]*nums[2]);
        Arrays.sort(nums);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
    }

    public static void FourthTask(double a,double b,double c){
        double d=b*b-4*a*c;
        if(d==0){
            System.out.println("Один корень");
            System.out.println(-b/2*a);
        }else{
            if(d>0){
                System.out.println("Два корня");
                System.out.println(-b+Math.sqrt(d)/2*a);
                System.out.println(-b-Math.sqrt(d)/2*a);
            }else{
                System.out.println("Complex roots, I'm bad at algebra");
            }
        }
    }

    public static void FifthTask(double a,double b, double step) {
        int j=0;
        double res=0;
        for(double i = a; i < b; i += step ){
            res=Math.sin(i);
            System.out.printf("%12.6f", res);
            j++;
            if(j==7){
                j=0;System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        double nums[]=new double[3];
        Scanner cin= new Scanner(System.in);
        nums[0] = cin.nextDouble();
        nums[1] = cin.nextDouble();
        nums[2] = cin.nextDouble();
        //FirstTask();
        //SecondTask(nums);
        //ThirdTask(new int[]{1,2,5});
        //FourthTask(nums[0],nums[1],nums[2]);
        //FifthTask(nums[0],nums[1],nums[2]);
    }
}
