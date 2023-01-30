package scannerassignment10questions;

import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {

        /* Type a program which calculates the perimeter of a triangle whose Side lengths are entered by user. (Use byte)
        Hint 1: Perimeter of a triangle is a + b + c
        Hint 4: To get byte, use nextByte()

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter side lengths of a Triangle");
        Byte a = input.nextByte();
        Byte b = input.nextByte();
        Byte c = input.nextByte();

        System.out.println("Perimeter of a Triangle is" + " " +(a + b+ c) );


    }
}
