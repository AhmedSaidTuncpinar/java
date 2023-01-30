package questionsolving;

import java.util.Arrays;

public class EasyArrayQuestions {

    public static void main(String[] args) {

        /*
        Basic Level

        1. "Jim", "Tom", "Mary","Susan", "Mark" Put these names in an Array and  print them on the console.
        2. Honda, Toyota, Suzuki, Ford, Mercedes, Bmw put these in an Array and print them on the console.
        3. 2010, 2011, 2012, 2013, 2014, 2015, 2019, 2020, 2021, 2022 put them in an Array and print them on the console.
        4. 58, 49, 34, 24, 28 , 14 put them in an Array and print only the first element on the console.
        5. Adam, Mary Kate, Berk, Hasan, Ali, Jon put them in Array and print the last element on the console.
        6. (12,14,24,33,38, 11, 15, 18 99) put them in an Array and  print the sum of the first and the last elements on the console.
        7. Z, B, C, M, D, S, T, A put them in an Array and print the sum of the first and second character.
        8. "2.1", "3.4", "5.8", "9.99", "19.99" put them in an Array and find the sum of all elements
        9. Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen print the elements in alphabetical order on the console in different lines.
        10. 289, 512, 11, 22, 0, 899, 99,345, 1, put them in an Array and print the elements as ascending order.
        11. Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen put them in an  array and print the elements before Renault.
        12. "Alan", "Thompson", "Mark", "Jackson", "Tommy", "Martin" put them in an array and print the elements different from Tommy

        Requirements:
        ***. Arrays are created to put more values in a single data type.

        1. How to create an Array?
        String names[]= new String[2];
        names[0]= "Mac";
        names[1]= "HP";

         int ages[]= new int[3];
         ages[0]= 18;
         ages[1]= 25;
         ages[2]= 33;

         short and efficient way:

         String names[]= {Mac, Windows, HP, Acer, Sony};
         int ages[]= {18, 0, 1, 3, 4, 5, 8, 190};

         2.How to print an Array?
         System.out.println(Arrays.toString(names));

         3. How to print a specific element in an Array?
          System.out.println(names[3]);

         4. How to find the first element in an Array?
         Arrays are created as indexes. So zero  [0] always gives us the first element of an Array.

         5. How to find the last element in an Array?
         length-1 method always gives us the last element of an Array.
         ages[ages.length-1]

         6. How to do alphabetical or ascending order in an Array?
         Arrays.sort(array name);
         always gives us alphabetical or ascending order in an Array

         7. When we want to get the sum of the certain elements in Array for example first and last, we will do regular concatenation on printing.
         for example: system.out.println(ages[0] + ages[ages.length-1]);

         But when we want to get the sum of the all elements in Array, we need to create a container and use the below formula with for each loops as dynamic.
         int  sum= 0;
        for (int w: prices){
            sum= sum + w;
        }
        System.out.println(sum);


         8. When we want to get the elements before an element in Array we need to use "for each loop" and "if" with "break", for example:

         for(string w: names)
         if if (w.equals("Tom")){

                break;
            }
        9. When we want to get the elements different from an element in Array, we need to use "for each loop" and "if" with "continue", for example:

         for(string w: names)
         if if (w.equals("Tom")){

                continue;
            }
         */

        // 1. "Jim", "Tom", "Mary","Susan", "Mark" Put these names in an Array and  print them on the console.


        String names[]= {"Jim", "Tom", "Mary","Susan", "Mark"};

        System.out.println(Arrays.toString(names));

        // 2. Honda, Toyota, Suzuki, Ford, Mercedes, Bmw put these in an Array and print them on the console.

        String cars[]= {"Honda", "Toyota", "Suzuki", "Ford", "Mercedes", "Bmw"};

        System.out.println(Arrays.toString(cars));

        // 3.  2010, 2011, 2012, 2013, 2014, 2015, 2019, 2020, 2021, 2022 put them in an Array and print them on the console.

        int years[]= {2010, 2011, 2012, 2013, 2014, 2015, 2019, 2020, 2021, 2022};

        System.out.println(Arrays.toString(years));

        // 4. 58, 49, 34, 24, 28 , 14 put them in an Array and print only the first element on the console.

        int numbers[]= {58, 49, 34, 24, 28, 14};

        System.out.println(numbers[0]);

        //  5. Adam, Mary Kate, Berk, Hasan, Ali, Jon put them in Array and print the last element on the console.

        String names1[]= {"Adam", "Mary","Kate", "Berk", "Hasan", "Ali", "Jon"};

        System.out.println(names1[names1.length-1]);

        // 6. (12,14,24,33,38, 11, 15, 18 99) put them in an Array and  print the sum of the first and the last elements on the console.

        int numbers1[]= {12,14,24,33,38, 11, 15, 18, 99};

        int sum =0;

        for (int w: numbers1){

            sum= sum + w;
        }
        System.out.println(sum);

        // 7. Z, B, C, M, D, S, T, A put them in an Array and print the sum of the first and second character.

        char chr[]= {'Z', 'B', 'C', 'M', 'D', 'S', 'T', 'A'};

        System.out.println(chr[0] + chr[chr.length-1]);

        // 8. "2.1", "3.4", "5.8", "9.99", "19.99" put them in an Array and find the sum of all elements.
         double dbl[]={2.1, 3.4, 5.8, 9.99, 19.99};

         double sum1=0;
         for (double w: dbl){

             sum1=sum1 +w;
         }

        System.out.println(sum1);

         // 9. Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen print the elements in alphabetical order on the console in different lines.

        String cars1[]={"Volvo", "Audi", "Volkswagen", "Renault", "Peugeot", "Citroen"};

        Arrays.sort(cars1);
        System.out.println(Arrays.toString(cars1));

        // 10. 289, 512, 11, 22, 0, 899, 99,345, 1, put them in an Array and print the elements as ascending order.

        int number2[]={289, 512, 11, 22, 0, 899, 99,345, 1};
        Arrays.sort(number2);
        System.out.println(Arrays.toString(number2));


        System.out.println("==========================");
        // 11. Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen put them in an  array and print the elements before Renault.

        String cars3[]= {"Volvo", "Audi", "Volkswagen", "Renault", "Peugeot", "Citroen"};

        for (String w: cars3){

            if (w.equals("Renault")){

                break;
            }
            System.out.println(w);
        }
        System.out.println("==============================");

        //12. "Alan", "Thompson", "Mark", "Jackson", "Tommy", "Martin" put them in an array and print the elements different from Tommy

        String names3[]={"Alan", "Thompson", "Mark", "Jackson", "Tommy", "Martin"};

        for (String w: names3){

            if (w.equals("Tommy")){

                continue;

            }
            System.out.println(w);
        }




    }
}
