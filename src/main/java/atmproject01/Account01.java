package atmproject01;

import java.util.Scanner;

public class Account01 {

    private int accountNumber;

    private int pinNumber;

    private double checkingBalance;//This shows the checking amount(account money)

    private double savingBalance;//This shows the saving amount(account money)

    Scanner input = new Scanner(System.in);

   public int getAccountNumber(){

       return accountNumber;
   }

   public void setAccountNumber(int accountNumber){

       this.accountNumber = accountNumber;
   }

   public int getPinNumber(){

       return pinNumber;
   }

   public void setPinNumber(int pinNumber){

       this.pinNumber= pinNumber;
   }

   public double getCheckingBalance(){

       return checkingBalance;
   }

   public void setCheckingBalance(double checkingBalance){

       this.checkingBalance = checkingBalance;
   }

   public double getSavingBalance(){
       return savingBalance;
   }

   public void setSavingBalance(double savingBalance){

       this.savingBalance = savingBalance;
   }

    //Calculate the checking balance after the withdrawing
}
