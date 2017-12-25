package com.company;
import ru.omsu.imit.october.FinanceReport;
import ru.omsu.imit.october.Payment;

import java.util.Scanner;


public class Main {




    public static void main(String[] args) {
        int nums[]=new int[6];
        double []xy= new double[2];
        Scanner cin= new Scanner(System.in);
        /*StringBuilder test1 = new StringBuilder("Omae wa mou shindeiru!!");
        StringBuilder test2 = new StringBuilder("=");
        StringBuilder test3 = new StringBuilder("==ph'nglui===mglw'nafh===cthulhu====r'lyeh======wgah'nagl=====fhtagn=====");*/
        try{
            Payment a = new Payment("Летов Игорь Федорович",3,12,2015,220000);
            Payment b = new Payment("Лейбниц Готтфрид Петрович ;10.11.2012;2001");
            FinanceReport dee = new FinanceReport(a,b);
            dee.add(new Payment("Черный Властелин Пластилинович;12.1.2017;9001"));
            dee.add(new Payment("Лебег Анри Леонович;12.10.2017;91001"));
            dee.add(new Payment("Лаплас Пьер-Симон;15.02.2010;400000"));
//            dee.toFile();
//            dee.fromFile();
//            dee.toStreamByFirstChar('Л');
            for(int i = 0; i < dee.amountOfPayments(); i++){
                System.out.println(dee.getPayment(i).toString());
            }
        } catch (ru.omsu.imit.october.incorrectDate incorrectDate) {
            incorrectDate.printStackTrace();
        } catch (ru.omsu.imit.october.invalidSum invalidSum) {
            invalidSum.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
