package TernaryQuestions;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
         /*

        Take values of length and width of a rectangle from user and check if it is square or not.


          */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length and width of a rectangle");
        Byte length = input.nextByte();
        Byte width = input.nextByte();

       Object result= length.equals(width) ? "It is square" : "It is not square";
        System.out.println(result);


    }
}
