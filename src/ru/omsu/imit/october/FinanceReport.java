package ru.omsu.imit.october;
import java.io.*;
import java.util.ArrayList;


public class FinanceReport {
    private ArrayList<Payment> payments = new ArrayList<>();

    public FinanceReport (){

    }

    public FinanceReport(FinanceReport orig){
        for(int i = 0; i < orig.amountOfPayments(); i++){
            this.add(new Payment(orig.getPayment(i)));
        }
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

        try (BufferedWriter cin = new BufferedWriter(new FileWriter("finRep.txt", false))){
            for(int i=0;i<payments.size();i++){
                cin.write(payments.get(i).toFileString());
                cin.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void fromFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader("finRep.txt")))
        {
            String origin;
            while((origin = reader.readLine()) != null){
                payments.add(new Payment(origin));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Throwable e){
            e.printStackTrace();
        }


    }

    public FinanceReport getPaymentsByFirstChar(char a){
        FinanceReport result = new FinanceReport();
        for(int i = 0; i < payments.size(); i++){
            if( this.getPayment(i).getFio().charAt(0) == a ){
                result.add(this.getPayment(i));
            }
        }
        return result;
    }

    public void toStreamByFirstChar(char a){
        FinanceReport res = this.getPaymentsByFirstChar(a);
        try (BufferedWriter cin = new BufferedWriter(new FileWriter("firstChar.txt", false))){
            for(int i=0;i<res.payments.size();i++){
                cin.write(res.payments.get(i).toString());
                cin.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Payment> getPaymentsLowerThan(int num){
        ArrayList<Payment> result = new ArrayList<>();
        for(int i = 0; i < this.payments.size(); i++){
            if(payments.get(i).sum < num){
                result.add(payments.get(i));
            }
        }
        return result;
    }

//    public Payment summarPayment(String date) throws invalidDataArgument{
//        String[] newDate = date.split("[.]");
//        if(newDate.length<3) throw new invalidDataArgument();
//        Payment res = new Payment("summary", Integer.parseInt(newDate[0]),Integer.parseInt(newDate[1]),Integer.parseInt(newDate[2]),1);
//    }
}
