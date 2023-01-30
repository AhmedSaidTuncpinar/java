package day04nestedifswitch;

import java.util.Scanner;

public class SwitchQuestion02 {

    public static void main(String[] args) {

       /* Write a Java program user will choose answer among A, B, C, or D.
    If the answer is true, output will be “True.”
    If the answer is false, output will be “False”. Correct answer is ‘C’ for the multiple option question.
        */

        Scanner input= new Scanner(System.in);
        System.out.println("Choose an answer among a, b, c or d");
        String answer = input.next();

        switch (answer){
            case "a" :
                System.out.println(false);
                break;
            case "b":
                System.out.println(false);
                break;
            case "c":
                System.out.println(true);
                break;
            case "d":
                System.out.println(false);
                break;
            default:
                System.out.println("Invalid Data");




        }

    }
}
