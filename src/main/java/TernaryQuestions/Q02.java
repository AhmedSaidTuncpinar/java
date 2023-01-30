package TernaryQuestions;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

       /* Ask user to enter an integer. If the number has 3 digits, output will be
“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
        How can you decide the number of digits of an integer?

        */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");

        Integer a = input.nextInt();

        Object result = (a>=100 && a<1000) ? "This number has 3 digits" : "This number has no 3 digits";
        System.out.println(result);
    }
}
