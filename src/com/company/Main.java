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
        StringBuilder test1 = new StringBuilder("Omae wa mou shindeiru!!");
        StringBuilder test2 = new StringBuilder("=");
        StringBuilder test3 = new StringBuilder("==ph'nglui===mglw'nafh===cthulhu====r'lyeh======wgah'nagl=====fhtagn=====");
        try{
            Payment a = new Payment("Летов Игорь Федорович",3,12,2015,220000);
            System.out.println(a.toString());
        } catch(Exception e){
            System.out.println(e);
        } catch (com.company.incorrectDate incorrectDate) {
            incorrectDate.printStackTrace();
        } catch (com.company.paymentIsLessOrEqualToZero paymentIsLessOrEqualToZero) {
            paymentIsLessOrEqualToZero.printStackTrace();
        }


    }
}
