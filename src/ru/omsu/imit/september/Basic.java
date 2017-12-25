package ru.omsu.imit.september;

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
        if(a==0&&b!=0){
            System.out.println("Один корень");
            System.out.println(-c/b);
            return;
        }
        if(a==0&&b==0){
            System.out.println("Невозможно вычислить корни");
            return;
        }
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
                System.out.println("Все корни комплексные");
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
    public static void SixthTask(
            double a1, double b1, double c1,
            double a2, double b2, double c2
    ){

        double delta = a1 * b2 - a2 * b1;
        double x = c1 * b2 - c2 * b1;
        double y = c2 * a1 - c1 * a2;

        if (c1 == 0 && c2 == 0) {
            if (a1 == 0 && b1 == 0 && a2 == 0 && b2 == 0) {
                System.out.println("Бесконечное количество решений (R^2).");
            }
            else if ( (a1 == 0 && b1 != 0 && a2 == 0 && b2 == 0) || (a2 == 0 && b2 != 0 && a1 == 0 && b1 == 0) ) {
                System.out.println("Решение системы: x - любое, y = 0.");
            }
            else if ( (a1 != 0 && b1 == 0 && a2 == 0 && b2 == 0) || (a2 != 0 && b2 == 0 && a1 == 0 && b1 == 0) ) {
                System.out.println("Решение системы: y - любое, x = 0.");
            }
            else if ( (a1 != 0 && b1 != 0 && a2 == 0 && b2 == 0) || (a1 == 0 && b1 == 0 && a2 != 0 && b2 != 0) ) {
                System.out.println("Решение системы: y - любое, x = -y.");
            }
            else {
                x = 0; y = 0;
                System.out.println("Решение системы: x = " + x + "; y = " + y + ";");
            }
        } else {
            if (delta != 0) {
                x = x / delta;
                y = y / delta;
                System.out.println("Решение системы: x = " + x + "; y = " + y + ";");
            } else {
                if ((x != 0) || (y != 0)) {
                    System.out.println("Решений нет.");
                } else if ((x == 0) && (y == 0)) {
                    if (((a1 == 0) && (b1 == 0) && (c1 != 0)) || ((a2 == 0) && (b2 == 0) && (c2 != 0))) {
                        System.out.println("Решений нет.");
                    }
                    if ((a1 == 0 && b1 != 0 && c1 != 0) || (a2 == 0 && b2 != 0 && c2 != 0)) {
                        if (b1 == 0) {
                            y = c2 / b2;
                        } else {
                            y = c1 / b1;
                        }
                        System.out.println("Решение системы: y = " + y);
                    }
                    if ((a1 != 0 && b1 == 0 && c1 != 0) || (a2 != 0 && b2 == 0 && c2 != 0)) {
                        if (a1 == 0) {
                            x = c2 / a2;
                        } else {
                            x = c1 / a1;
                        }
                        System.out.println("Решение системы: x = " + x);
                    }
                    if ((a1 / a2 == b1 / b2) && (c1 / c2 == b1 / b2)) {
                        if (a2/a1 == 0) {
                            System.out.println("Решение системы бесконечно: (" + a1 + ")x + (" + b1 + ")y = " + c1);
                        } else if (a1/a2 == 0) {
                            System.out.println("Решение системы бесконечно: (" + a2 + ")x + (" + b2 + ")y = " + c2);
                        } /*else if () {
                        }*/
                        else {
                            double temp = 0;
                            if (a1 / a2 > 1) {
                                temp = a2;
                                a2 /= temp;
                                b2 /= temp;
                                c2 /= temp;
                                a1 = a2; b1 = b2; c1 = c2;
                            }
                            else {
                                temp = a1;
                                a1 /= temp;
                                b1 /= temp;
                                c1 /= temp;
                            }
                            System.out.println("Решение системы бесконечно: (" + a1 + ")x + (" + b1 + ")y = " + c1);
                        }
                    }
                    if ((a1 / a2 == b1 / b2) && (c1 / c2 != b1 / b2)) {
                        System.out.println("Решений нет.");
                    }
                }
            }
        }
    }

    public static double SeventhTask(double x, double precision){
        double sum1 = 0,next;
        int count = 0;
        next = 1;
        sum1 += next;
        while(Math.abs(next) >= precision){
            count++;
            next *= x/count;
            sum1 += next;
        }
        return sum1;
    }
}
