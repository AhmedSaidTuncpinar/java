package day19practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_TernaryPractice {

    public static void main(String[] args) {

        //Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
        //for odd integers and print it on the console by using ternary.

        Scanner input= new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num= input.nextInt();

        System.out.println(num%2==0 ? "Even": num +3);

        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */

       String[] arr= {"John", "Brad", "Angel", "Sofia", "Emily"};
       String[] brr= {"sofia", "Brad", "grace", "emily", "hazel"};
        List<String> list = new ArrayList<>();
       for (String w: arr){
           for (String u: brr){
               if (w.equalsIgnoreCase(u)){
                   list.add(u);

               }
           }

       }
       System.out.println(list);
    }
}
