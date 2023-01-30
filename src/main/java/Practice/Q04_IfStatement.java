package Practice;

import java.util.Scanner;

public class Q04_IfStatement {

    public static void main(String[] args) {

        /*
     Ask user to enter the values of length and width of a rectangle, then check if it is square or not.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length and width of a Rectangle");
        double width = input.nextDouble();
        double length = input.nextDouble();

        if(width == length) {
            System.out.println("it is square");
        }
            if(width != length){
                System.out.println("it is not square");
            }


        }
    }

