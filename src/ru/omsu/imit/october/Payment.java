package ru.omsu.imit.october;


public class Payment {
    static int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31},
            leapMonths =  {0,31,29,31,30,31,30,31,31,30,31,30,31};

    String fio = "";
    int day,month,year;
    boolean leapYear;
    //сумма в копейках
    int sum;

    public Payment(String name, int day, int month, int year, int sum)throws incorrectDate,invalidSum{
        this.fio = name;
        checkYear(year);
        this.year=year;
        checkMonth(month);
        this.month=month;
        checkDay(day);
        this.day=day;
        if(sum<=0) throw new invalidSum();
        this.sum=sum;
    }


    public Payment(String origin){
        String[] z=origin.split(";");
        this.setFio(z[0]);
        this.setSum(Integer.parseInt(z[2]));
        String[] date = z[1].split("[.]");
        this.setYear(Integer.parseInt(date[2]));
        this.setMonth(Integer.parseInt(date[1]));
        this.setDay(Integer.parseInt(date[0]));
    }
    /*public Payment(String origin){
        String[] z=origin.split(";");
        String[] date = z[1].split("[.]");
        this (
                z[0],
                Integer.parseInt(date[0]),
                Integer.parseInt(date[1]),
                Integer.parseInt(date[2]),
                Integer.parseInt(z[2])
        );
    }*/

    public Payment(Payment orig){
        this (orig.toFileString());
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        checkDay(day);
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        checkMonth(month);
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        checkYear(year);
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
        //return "Плательщик:"+fio+", Дата: "+day+"."+month+"."+year+" Сумма: "+sum/100+" руб. "+sum%100+" коп.";
        return String.format("Плательщик: %s, Дата: %02d.%02d.%04d Сумма: %d руб. %d коп.",fio,day,month,year,sum/100,sum%100);
    }

    String toFileString(){
        return fio+";"+day+"."+month+"."+year+";"+sum;
    }

    private void checkYear(int year) throws incorrectDate{
        if(year < 1970) throw new incorrectDate("year is incorrect");
        leapYear = year%4 == 0;
    }
    private void checkMonth(int month) throws incorrectDate{
        if(month < 1 || month > 12) throw new incorrectDate("month value is incorrect");
    }

    private void checkDay(int day) throws incorrectDate{
        if(leapYear){
            if(day < 1 || day > leapMonths[this.month]) throw new incorrectDate("not suitable day");
        }else{
            if(day < 1 || day > months[this.month]) throw new incorrectDate("not suitable day");
        }
    }
}
