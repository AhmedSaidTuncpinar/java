package day04nestedifswitch;

import java.util.Scanner;

public class IfStatement01Review {

    public static void main(String[] args) {

        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your age");
        Byte age = input.nextByte();
        if(age<0){
            System.out.println("İnvalid");
        }
        else if(age<5){
            System.out.println("Baby");
        }else if(age<13) {

        System.out.println("Child");

        }else if(age<21){
            System.out.println("Teenager");

        }else if(age<31){
            System.out.println("Adult");
    }else{
            System.out.println("Enter a valid age");
        }
    }
}
