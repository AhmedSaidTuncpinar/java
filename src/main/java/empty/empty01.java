package empty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class empty01 {

    public static void main(String[] args) {

        // 1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }

        int brr[][]= {{1,2,3},{4,5,6}};
        int sum = 0;
        for (int[] w: brr){

            for (int u:w){

                sum=sum+u;
            }
        }
        System.out.println(sum);

        // 2.2) Find the product of the last elements in the array elements of the
        //given multi dimensional array { {1,2,3}, {4,5}, {6} }

        int arr[][]={ {1,2,3}, {4,5}, {6} };

       // 5) Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
          //      For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
       // Hint: Use split()

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter long two sentences");
        String a = scan.nextLine();

        String b [] = a.split(" ");

        System.out.println(b.length);
        System.out.println(Arrays.toString(b));

        //Write a Java program to remove a specific element from an array.
        int crr[][]= {{1,2,3},{4,5,6}};



        //Create a String list whose elements are A, C, E, and F. Print it on the console.



    }
}
