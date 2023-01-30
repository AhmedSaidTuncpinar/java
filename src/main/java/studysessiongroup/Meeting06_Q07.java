package studysessiongroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Meeting06_Q07 {

    public static void main(String[] args) {



      /*

         Q07. Given String array
                reverse the String array
                print the reversed array
                NOTE: While printing the array dont use for loop
               Use Arrays.toString(your_array_name);

         */
    //Step 1. We need scanner class to get data from user.

    Scanner scan = new Scanner(System.in);

    //Step 2. Create String container to put the data given by user. We used nextline() method to get several data.

    String myStr = scan.nextLine();

    //Step 3. Create ? . we used split() method to split the given data.

    String[] useThisArray = myStr.split(" ");

    //Step 4. Create Array List but why?



    ArrayList<String> list = new ArrayList<>();

    //Step 5. Create for each loop to get the data one by one from our splited Array List.

            for( String w: useThisArray){

        //Step 6. use add() method to put the data on our Array list
        list.add(w);
    }

            System.out.println(list);


            Collections.reverse(list);
            System.out.println(list);




}
}