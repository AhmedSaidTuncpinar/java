package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview03 {

    public static void main(String[] args) {

        //Example 1: Let user enter students names into the app. Create and Array together with the user

        // There are 2 steps to solve it.
        // 1. Step create an Array

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the students you want to enter");
        int numOfStd = input.nextInt();

        String names []= new String[numOfStd];
        System.out.println(Arrays.toString(names));

        // 2. Step Insert the elements into the Array
        //We use for loop because in for loop there is index, but for each there is elements and it is best for elements.

        for (int i=0; i<numOfStd; i++){
            System.out.println("Enter the " + (i+1)+ ". student name");
            String stdName= input.next();
            names[i]=stdName;
        }
        System.out.println(Arrays.toString(names));

    }
}
