package scannerassignment10questions;

import java.util.Scanner;

public class Question05 {

    public static void main(String[] args) {

       //  Type a program which calculates the area and the perimeter of a circle whose radius is entered by user. (Use float)
        //Hint 1: Take pi number as 3.14159
        //Hint 2: Area of a circle is 3.14159 x radius x radius
        //Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
        // Hint 4: To get float, use nextFloat().

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius a circle ");

        Float pi = input.nextFloat();
        System.out.println("Area of a Circle is" + " " + (pi*pi/2*pi/2));
        System.out.println("Perimeter of a circle is"+ " " + 2 * (pi * pi/2));


    }
}
