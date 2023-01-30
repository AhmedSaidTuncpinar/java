package IfElseQuestions;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        //Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
        //then output will be “Hey man you retired!” else output will be “No need to work”

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age and Gender");
        Integer age=input.nextInt();
        String gender= input.next();

        if (age>=65 && gender.equals("Male")){
            System.out.println("Hey man you retired");
        }if (age<65 || (gender.equals("female"))) {
            System.out.println("Invalid Data");
        }else{
            System.out.println("No need to work");
    }
    }
}