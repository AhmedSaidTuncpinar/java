package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations05 {

    public static void main(String[] args) {

        String str = "Ali is 13 years old, I like Ali, Ali does not like me!...";

        //Example 1: How many punctuation marks are used in the given String.

        int num1 = str.length();
        int num2 = str.replaceAll("\\p{Punct}", "").length();
        System.out.println(num1-num2);

        //Example 2: Ask user to enter his/her full name and fix if the user enters space at the beginning and at the end.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first and the last name");
        String fullName = input.nextLine();
        System.out.println(fullName);

        String fixedFullName= fullName.trim();
        System.out.println(fixedFullName);
        //Trim() method removes spaces from the beginning and from the end,
        // it does not touch spaces in the middle



    }
}
