package com.company;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FinanceReport {
    //private Payment[] payments;
    private ArrayList<Payment> payments = new ArrayList<>();

    public FinanceReport (){

    }
    public void setPayment(int index, Payment pay){
        payments.set(index,pay);
    }
    public FinanceReport (Payment ... arr){
        for(int i = 0; i < arr.length; i++){
            payments.add(arr[i]);
        }
    }
    public void add(Payment pay){
        payments.add(pay);
    }

    public Payment getPayment(int index){
        return payments.get(index);
    }

    public int amountOfPayments(){
        return payments.size();
    }

    public void toFile(){

        try {
            FileWriter cin1 = new FileWriter("finRep.txt", false);
            BufferedWriter cin = new BufferedWriter(cin1);
            for(int i=0;i<payments.size();i++){
                cin.write(payments.get(i).toFileString());
                cin.newLine();
            }
            cin.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void fromFile(String filename){

    }
}
