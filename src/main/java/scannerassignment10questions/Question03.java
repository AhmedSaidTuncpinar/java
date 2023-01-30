package scannerassignment10questions;

import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {

        //3. Type a program which calculates the area and perimeter of a rectangle whose length and width entered by user.
        // Hint. 1 Area of a rectangle is width x length
        // Hint. 2. Perimeter of a rectangle is 2x (width + length)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length and width a rectangle");
        Double width = input.nextDouble();
        Double length = input.nextDouble();

        System.out.println("Area of a Rectangle is" + " " + (width*length));
        System.out.println("Perimeter of a Rectangle is" + " " + 2* (width + length));


    }
}
