package scannerassignment10questions;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {

        // Type a program which calculates the volume of a rectangular prism whose length, width and height are entered by user.
        // Hint1: Volume of a rectangular prism is width x length x height.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter length, width and height for a Rectangular Prism");
        Integer length = input.nextInt();
        Integer width = input.nextInt();
        Integer height = input.nextInt();

        System.out.println("The volume of a Rectangular Prism is" + " " + (length * width * height));

    }
}
