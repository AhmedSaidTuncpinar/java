package studysessiongroup;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Meeting01 {
    public static void main(String[] args) {


        //Find the sum of all list elements in an integer list

        List<Integer> arr= Arrays.asList(12, 11, 15, 34);
        int sum=0;
        for (Integer w: arr){

            sum= sum +w;
        }
        System.out.println(sum);

        // Find the multiplication of all even list elements in an integer list

        List<Integer> brr= Arrays.asList(12, 11, 15, 34, 8, 38, 13, 33);
        int sumOf=1;

        for (Integer u: brr){
            if (u%2==0 ){

                sumOf=sumOf*u;


            }else {
                continue;
            }

        }
        System.out.println(sumOf);

        //If a list has 15 or 13, remove them.
        // Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54

        List<Integer> crr= Arrays.asList(10, 31, 15, 13, 54);

        System.out.println(crr);

        /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

  */
        Scanner input = new Scanner(System.in);

        List<Integer> myList = new ArrayList<>();

        System.out.println("Enter the number of elements");
        int size = input.nextInt();

        for (int i = 0; i<size; i++){
            System.out.println("Enter the elements");
            int elements = input.nextInt();
            myList.add(elements);
        }
        System.out.println(myList);

        System.out.println("Enter the element that you want to remove");
        int rem = input.nextInt();
        if (myList.contains(rem)){

        }














        //Type the code that finds out how many days Ali lived. Date of birth of Ali is 12th of May 2002
        LocalDate dAli= LocalDate.of(2002, 05, 12);
        LocalDate dnow= LocalDate.now();
        long dayOfAli = ChronoUnit.DAYS.between(dAli,dnow);
        System.out.println(dayOfAli);//7447
    }


}
