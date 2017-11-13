package com.company;


public class FinanceReport {
    private Payment[] payments;

    public FinanceReport (){

    }

    public FinanceReport (Payment ... arr){
        payments = arr;
    }

    public int amountOfPayments(){
        return payments.length;
    }
}
