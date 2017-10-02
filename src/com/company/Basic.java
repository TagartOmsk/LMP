package com.company;

import java.util.Arrays;

public class Basic {
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
    //добавить обработку нулей
    public static void FourthTask(double a,double b,double c){
        double d=b*b-4*a*c;
        if(d==0){
            System.out.println("Один корень");
            System.out.println(-b/(2*a));
        }else{
            if(d>0){
                System.out.println("Два корня");
                System.out.println((-b+Math.sqrt(d))/(2*a));
                System.out.println((-b-Math.sqrt(d))/(2*a));
            }else{
                System.out.println("Complex roots, I'm bad at algebra");
            }
        }
    }

    public static void FifthTask(double a,double b, double step) {
        int j=0;
        double res=0.0;
        if(step==0){
            System.out.println("Step can't be equal to zero!!");
            return;
        }
        if(a<b&&step<0){
            System.out.println("Incorrect values");
            return;
        }else{
            for(double i = a; i < b; i += step ){
                res=Math.sin(i);
                System.out.printf("%12.6f", res);
                j++;
                if(j==10){
                    j=0;System.out.println();
                }
            }
        }
        if(a>b&&step>0){
            System.out.println("Incorrect values");
            return;
        }else{
            for(double i = a; i > b; i += step ){
                res=Math.sin(i);
                System.out.printf("%12.6f", res);
                j++;
                if(j==10){
                    j=0;System.out.println();
                }
            }
        }

    }
    //переписать
    public static double[] SixthTask (double a1, double b1, double c1, double a2, double b2, double c2)
    {
        double x = 0;
        double y = 0;
        if (a1 == 0 && b1 == 0) {
            System.out.println("SORRE, LINE EX NE VICHISLYAETSYA");
        } else if (a2 == 0 && b2 == 0) {
            System.out.println("SORRE, LINE EX NE VICHISLYAETSYA");
        } else if (a1 != 0){
            while (a1 != 0 && a2 != 0) {
                if (a1 > a2) {
                    a1 = a1 - a2;
                    b1 = b1 - b2;
                    c1 = c1 - c2;
                } else {
                    a2 = a2 - a1;
                    b2 = b2 - b1;
                    c2 = c2 - c1;
                }
            }
            if (a1 == 0) {
                y = c1 / b1;
                x = (c2 - b2 * y) / a2;
            } else {
                y = c2 / b2;
                x = (c1 - b1 * y) / a1;
            }
        } else {
            while (b1 != 0 && b2 != 0) {
                if (b1 > b2) {
                    a1 = a1 - a2;
                    b1 = b1 - b2;
                    c1 = c1 - c2;
                } else {
                    a2 = a2 - a1;
                    b2 = b2 - b1;
                    c2 = c2 - c1;
                }
            }
            if (b1 == 0) {
                x = c1 / a1;
                y = (c2 - a2 * x) / b2;
            } else {
                x = c2 / a2;
                y = (c1 - a1 * x) / b1;
            }
        }
        double[] arr = {x,y};
        return arr;
    }

    private static double factorial(int arg){
        double result=1;
        if(arg==0)return result;
        else
            for(int i=arg;i>0;i--){
                result*=i;
            }
        return result;
    }

    public static double SeventhTask(double x, double precision){
        double sum1=0,next;
        int count=0;
        next=1;
        sum1+=next;
        while(Math.abs(next)>=precision){
            count++;
            next*=x/count;
            sum1+=next;
        }
        return sum1;
    }

    /*public static double[] lineEquation(double a1, double b1, double c1, double a2,double b2, double c2){
        //a1x+b1y=c1
        //a2x+a2y=c2
        double x,y;
        if(a1==0&&b1==0){
            return null;
        }
        if(a2==0&&b2==0){
            return null;
        }
        while(a1!=0||a2!=0||b1!=0||b2!=0){
            Math.max(a1,a2)=Math.max(a1,a2)
        }

    }*/

}
