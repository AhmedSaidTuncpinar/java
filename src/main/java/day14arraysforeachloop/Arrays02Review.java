package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02Review {

    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"

        String date= "09/20/2022";
        String dateArr[]= date.split("/");
        System.out.println(Arrays.toString(dateArr));
        System.out.print("Month:"+ dateArr[0]+ " "  );
        System.out.print("Day:" + dateArr[1]+ " ");
        System.out.print("Year:"+ dateArr[2]);

        //Example 2:Get string from user and type code to find the number of words in the String.
        //          "I like to move it, move it" ==> 7

        System.out.println("===================================");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();

        String arr[]= str.split(" ");
        System.out.println(arr.length);

        //Example 3: Count the number of words starts with "a" in the String

    }
}
