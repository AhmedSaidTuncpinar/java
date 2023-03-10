package day13arrays;

import java.util.Arrays;

public class Arrays01 {

    /*

    When we create byte, short, int, long, float, double, char, boolean cantainers we can store only a single value inside them.
    But sometimes we need to store multiple values in a single container.
    To be able to store multiple values Java created a new structure, its name is Array.
     */

    public static void main(String[] args) {

       /*
        How to create an Array
        To create array, you will type data type according to needs, and then name it with bracelets as below:

        Note; Arrays are to store multiple data in single data type. You can not store different data types in an Array.
        */

        String names[]= new String[5];

        //How to print an Array

        System.out.println(Arrays.toString(names));
        names[0]= "Jim";
        names[1]= "Tom";
        names[2]= "Mary";
        names[3]= "Susan";
        names[4]= "Mark";
        System.out.println(Arrays.toString(names));


        //How to print a specific element in an Array

        System.out.println(names[3]);

        //Create an integer array and print the sum of the first and the last elements on the console.

        int ages[]= new int[7];
        System.out.println(Arrays.toString(ages));
        ages[0]=12;
        ages[1]=23;
        ages[2]=25;
        ages[3]=14;
        ages[4]=17;
        ages[5]=12;
        ages[6]=14;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length-1]);

        //Example 2: Create a double array and find the sum of all elements

        double prices []= new double[4];
        prices [0]= 1.2;
        prices [1]= 2.3;
        prices [2]= 5.0;
        prices [3]= 4.51;

        System.out.println(Arrays.toString(prices));

        double sum=0;

        for (int i= 0; i< prices.length; i++){

            sum=sum +prices[i];

        }

        System.out.println(sum);

        //2. Way; We will solve the task by using for each loop.
        //For each loop can be used with Arrays and Collections.
        double summy = 0;
        for (double w: prices){

            summy=summy + w;

        }

        System.out.println(summy);


    }
}
