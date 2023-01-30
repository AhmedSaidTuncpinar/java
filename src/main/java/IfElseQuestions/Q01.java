package IfElseQuestions;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        // Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
        // else output will be “No need to work”
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age");
        Byte age = input.nextByte();
        if (age >= 18 && age <= 65) {
            System.out.println("You Should Work");
        } else if (age < 0) {
            System.out.println("Invalid Data");

        } else {
            System.out.println("No need to work");
            }
        }
    }
