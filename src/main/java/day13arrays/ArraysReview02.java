package day13arrays;

import java.util.Arrays;

public class ArraysReview02 {

    public static void main(String[] args) {


        //Example 1. Create a string array and print the elements in alphabetical order on the console in different lines.

        String names[]= new String[3];
        names[0]= "Tom";
        names[1]= "Mary";
        names[2]= "Susan";

        Arrays.sort(names);

        for (String w: names){

            System.out.println(w);
        }
        //Example 2; Create a string array and print the elements whose length is less than 10

        String cities[]= new String[3];

        cities[0]= "Valence";
        cities[1]= "Lyon";
        cities[2]= "Livron";

        Arrays.sort(cities);
        for (String w: cities){

            if (w.length()<10)

            System.out.println(w);
        }

        System.out.println("==========================================");

        //Example 3. Create a string array and print the elements before TOM

        String students[]= {"Jim","Kate","Jhon","Tom","Ali"};

        for (String w: students){

            if (w.equals("Tom")){
                break;
            }

            System.out.println(w);
        }

        System.out.println("==================================================");

        //Example 5. Create a string and print the elements different from Tom

        String employees []= {"Ahmet", "Melissa","Susan","Mary","Tom"};

        for (String w: employees){
            Arrays.sort(employees);
            if (w.equals("Tom")){
                continue;
            }
            System.out.println(w);
        }
    }
}
