package Practice;

import java.util.Scanner;

public class Q02_IfStatement {

    public static void main(String[] args) {

        /*
Type java code, if an integer is even, output will be “The integer is even”.
If the integer is odd, output will be “The integer is odd”.


         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");

        Integer number = input.nextInt();


        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        }





        }

