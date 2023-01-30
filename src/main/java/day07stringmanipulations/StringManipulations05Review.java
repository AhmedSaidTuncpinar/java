package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations05Review {
    public static void main(String[] args) {


        String str = "Ali is 13 years old, I like Ali, Ali does not like me!...";

        //Example 1: How many punctuation marks are used in the given String.
        int bl= str.length();
       int bl1= str.replaceAll("\\p{Punct}", "").length();
        System.out.println(bl-bl1);

        //Example 2: Ask user to enter his/her full name and fix if the user enters space at the beginning and at the end

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String fullName= input.nextLine();
        System.out.println(fullName);

        String fixedData = fullName.trim();
        System.out.println(fixedData);

    }
}
