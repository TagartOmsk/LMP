package com.company;
import java.util.Scanner;

public class UnlimitedArrayWorks {
    public static void DisplayArray(int arr[]){
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
    }


    public static int[] EnterArray(int length) {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            System.out.printf("Please enter a value of element #%d: ",i);
            arr[i]=input.nextInt();
        }
        return arr;
    }


    public static int ArraySum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int EvensQuantity(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static int NumbersWithinSegment(int[] arr,double a,double b){
        int count=0;
        if(a<=b)
            for(int i=0;i<arr.length;i++){
                if((arr[i]>=a)&&(arr[i]<=b))count++;
            }
        else
            for(int i=0;i<arr.length;i++){
                if((arr[i]>=b)&&(arr[i]<=a))count++;
            }
        return count;
    }

    public static boolean IsArrayPositive(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0)return false;
        }
        return true;
    }

    public static int[] ReverseArray(int[] arr){
        int[] newarr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[newarr.length-1-i]=arr[i];
        }
        return newarr;
    }
}