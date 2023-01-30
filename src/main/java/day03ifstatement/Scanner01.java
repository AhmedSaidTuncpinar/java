package day03ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //Example 1: Get first, middle and last names and the SSN from the user, then print them like the given format
        // Tom Jim Hanks
        // 234567891

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();


        System.out.println("Enter your middle name");
        String middletName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter your SSN ");
        String ssn = input.next();

        System.out.println(firstName + " " + middletName + " " + lastName);
        System.out.println(ssn);
    }
}
