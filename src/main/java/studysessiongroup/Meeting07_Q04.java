package studysessiongroup;

import java.util.ArrayList;

public class Meeting07_Q04 {

    public static void main(String[]args){

        // 5. Use a lambda expression in the ArrayList's forEach() method to print every item in the list.

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );
    }
    }

