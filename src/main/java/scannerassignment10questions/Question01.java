package scannerassignment10questions;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {

        // 1. Type a program which calculates the area and the perimeter of a square whose side length is entered by user.
        // Hint 1. Area of a square is length x length
        // Hint 2. Perimeter of a square is 4 x length.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of the length of the square");
        Integer length = input.nextInt();



        System.out.println("Area is" + " " + (length*length));
        System.out.println("Perimeter is" + " " + (4*length));




    }
}
