package com.company;
import java.util.Scanner;
import com.company.Basic;
import com.company.UnlimitedArrayWorks;
import com.company.Point3D;
import com.company.Vector3D;


public class Main {




    public static void main(String[] args) {
        int nums[]=new int[6];
        double []xy= new double[2];
        Scanner cin= new Scanner(System.in);
        String test1 = "Omae wa mou shindeiru!!";
        String test2 = "";
        String test3 = "ы";
        String test4,test5,test6;
        //test4 = cin.next();
//        test5 = cin.next();
//        test6= cin.next();
//        try
//        {
//            StringProcessor.StringCopier(test3,-2);
//        }catch(Exception e){
//            System.out.println(e);
//        }

//        System.out.println(StringProcessor.NumberOfEntries("XXXXXXX","XXX"));

        System.out.println(StringProcessor.NumsIntoChars("1 2 3 4 5 "));
    }
}
