package scannerassignment10questions;

import java.util.Scanner;

public class Question09 {

    public static void main(String[] args) {

        /*
        Type a program which asks user to enter his/her first name and last name, then print it on the console.
Hint: To get String, use nextLine()
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First name and Last name");
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        System.out.println(firstName + " " + lastName);


    }
}
