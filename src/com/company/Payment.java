package com.company;
class paymentIsLessOrEqualToZero extends Throwable{

    public paymentIsLessOrEqualToZero() {
        super("Payment amount must be at least more than 0.01");
    }
}
class incorrectDate extends Throwable{
    public incorrectDate(){
        super("Please, input the correct date");
    }
}

public class Payment {
    String fio = "";
    int day,month,year;
    //сумма в копейках
    int sum;

    public Payment(String name, int day, int month, int year, int sum)throws incorrectDate,paymentIsLessOrEqualToZero{
        this.fio = name;
        if(day<1||day>31) throw new incorrectDate();
        this.day=day;
        if(month<1||month>12) throw new incorrectDate();
        this.month=month;
        if(year<1970) throw new incorrectDate();
        this.year=year;
        if(sum<=0) throw new paymentIsLessOrEqualToZero();
        this.sum=sum;
    }
//rонструктор по строке
    //TODO
    /*public Payment(String origin){
        int day,month,year,sum;
        String name;
        int name1=origin.indexOf("Name:")+6, name2=origin.indexOf(", date:");
        name = origin.substring(name1,name2);
        day= new Integer(origin.substring(origin.indexOf("date: ")+7),)
    }*/

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (day != payment.day) return false;
        if (month != payment.month) return false;
        if (year != payment.year) return false;
        if (sum != payment.sum) return false;
        return fio != null ? fio.equals(payment.fio) : payment.fio == null;
    }

    @Override
    public int hashCode() {
        int result = fio != null ? fio.hashCode() : 0;
        result = 31 * result + (int) day;
        result = 31 * result + (int) month;
        result = 31 * result + (int) year;
        result = 31 * result + sum;
        return result;
    }

    @Override
    public String toString() {
        return "Payer Name: "+fio+", date: "+day+"."+month+"."+year+", amount of payment: "+sum/100.00;
    }
}
