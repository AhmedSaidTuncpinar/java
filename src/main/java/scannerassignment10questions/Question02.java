package scannerassignment10questions;

import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {

        //. 2. Type a program which calculates the cube of a number which is entered by user.
        // Hint.1: Cube of a number is a x a x a

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of cub");

        Integer a = input.nextInt();

        System.out.println("Cube of a number is " + (a*a*a));
    }
}
