package studysessiongroup;

import java.util.Scanner;

public class Meeting05_01 {

 /*
       Ask user to get an age,
            if the age less then and equal 10
                print  too young to create a facebook account

             if the age less then and equal 16
                print  too young to get a driver's license

             if the age less then and equal 18
                print  too young to get a tattoo

            if the age less then and equal 21
                print  too young to drink alcohol

            if the age bigger or equal to 21
                print  do what ever you want to do

        Note: use if else statement.
     */


    public static void main(String[] args) {

        //1.Step: Create an "object" from "Scanner Class"

        Scanner input = new Scanner(System.in);

        //2.Step: Give a message to user about the data you ask

        System.out.println("Enter your age please");

        //3.Step: Get the data by the help of the "input" object.
        int myAge = input.nextInt();



        //4. Step I will use here if, else if, statements.
        // let's remember else if() Statement
        //If it rains, I will cancel the trip; else if it snows I will stay at home
       // if(Condition) { Cancel the trip} else if(Condition) {Stay at home}

        if (myAge <=10) {
            System.out.println("too young to create a facebook account");
        } else if (  myAge <=16) {
            System.out.println("too young to get a driver's license");
        } else if ( myAge <= 18) {
            System.out.println("too young to get a tattoo");
        } else if ( myAge < 21) {
            System.out.println(" too young to drink alcohol");
        }else {
            System.out.println("do what ever you want to do");
        }

    }

}
