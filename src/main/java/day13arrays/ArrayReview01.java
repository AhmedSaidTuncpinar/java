package day13arrays;

import java.util.Arrays;

public class ArrayReview01 {

    public static void main(String[] args) {

        //Create an integer array and print the sum of the first and the last elements on the console.

        int ages[]= new int[3];
        ages[0]=48;
        ages[1]=38;
        ages[2]=14;

        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);

        //Example 2: Create a double array and find the sum of all elements
        double prices[]= new double[3];
        prices[0]= 2.3;
        prices[1]= 1.9;
        prices[2]= 1.5;

        double sum= 0;
        for (int i=0;i< prices.length;i++){
            sum = sum +prices[i];


        }
        System.out.println(sum);

        //2. Way; We will solve the task by using for each loop.
        //For each loop can be used with Arrays and Collections.
        double summy=0;
        for (double w: prices){
            summy=summy +w;

        }
        System.out.println(summy);
    }
}
