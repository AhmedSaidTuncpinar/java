package interview;

import java.util.Scanner;

public class FiveTimesHi {
    public static void main(String[]args){
       //Print on the console 5 times "hi" at the same line

     for (int i=1; i<6; i++){
         System.out.print("Hi" + " ");
     }


        System.out.println();

     //Write 6 times "Hi" at the same line on the console
        for (int i=1; i<7; i++)
            System.out.print("Hi" + " ");


        System.out.println();
        //Print 18 times "Ahmet" at the same line on the console.

        for (int i=0; i<19; i++){
            System.out.print("Ahmet" + " ");
        }
        System.out.println();
        //Print on the console 7 times "Good Morning" at the same line

        for (int i=0; i<8; i++){
            System.out.print("Good Morning" + " ");
        }

        System.out.println();

        //Print on the console 10 times "Hello World" at the same line
        for (int i= 0; i<11; i++){
            System.out.print("Hello World" + " ");
        }

        System.out.println();

        //Print on the console 7 times "Good Morning"

        for (int i=1; i<8; i++){
            System.out.println("Good Morning" + " ");
        }
        System.out.println();

        //Print 5 times "Kalimera" on the console at the same line
        for (int i=1; i<6; i++){
            System.out.print("Kalimera" + " ");
        }


        //Print 7 times "Ramadan" on the console at the same line
        for (int i=1; i<8; i++){
            System.out.print("Ramadan" + " ");
        }

        System.out.println();

        //Print 9 Times "School" on the console

        for (int i=1; i<10; i++){
            System.out.print("School" + " ");
        }
        System.out.println();
        //Ask user a string and print it on the console 5 times
        String a;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String");
        a=input.nextLine();
        for (int i=1; i<6; i++){
            System.out.print(" " + a);
        }
        }
    }

