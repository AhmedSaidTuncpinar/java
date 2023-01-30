package scannerassignment10questions;

import java.util.Scanner;

public class Question07 {

    public static void main(String[] args) {

        /*
        Type a program which converts the mile to kilometer. Mile value will be entered by user. (Use double)
Hint 1: km = mile x 1.6
Hint 2: To get double, use nextDouble()

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a mile value");
        Double mile = input.nextDouble();
        System.out.println("Km is" + " " + (mile * 1.16)) ;
    }
}
