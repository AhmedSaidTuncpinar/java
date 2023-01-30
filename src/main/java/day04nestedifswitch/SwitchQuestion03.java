package day04nestedifswitch;

import java.util.Scanner;

public class SwitchQuestion03 {

    public static void main(String[] args) {

        //A school has following rules for grading system:
        //1. For 50 - C 2. For 80 - B. 4. For 100 - A
        //Ask user to enter marks and print the corresponding grade

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mark among A, B, C");
        String mark = input.next();

        switch (mark){
            case "A":
                System.out.println("100");
                break;
            case "B":
                System.out.println("80");
                break;
            case "C":
                System.out.println("50");
                break;
            default:
                System.out.println("Wrong Data");
        }
    }
}
