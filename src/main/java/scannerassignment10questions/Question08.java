package scannerassignment10questions;

import java.util.Scanner;

public class Question08 {

    public static void main(String[] args) {

        /*
Type a program which converts the hours to seconds. Hours value will be entered by user. (Use long)
Hint 1: second = hour x 60 x 60
Hint 2: To get long, use nextLong()

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hour");
        Long hour = input.nextLong();


        System.out.println("Second is" + " " + (hour * 60 * 60) );



    }
}
