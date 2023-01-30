package day16multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class List01Review {
    public static void main(String[] args) {

        //short and preferable

        List<Integer> myList= new ArrayList<>();
        // to add list we need to use add() method as below:

        myList.add(38);
        myList.add(44);
        myList.add(14);
        System.out.println(myList);


        //How to add an element into a specific index

        myList.add(0,48);
        myList.add(1,38);
        myList.add(2,14);
        myList.add(3,9);
        myList.add(4,6);

        System.out.println(myList);

        //How to join two lists?

        List<String> names= new ArrayList<>();
        names.add("Tom");
        names.add("Hasan");
        names.add("Kate");

        List<String> lastNames= new ArrayList<>();
        lastNames.add("Hanks");
        lastNames.add("Yılmaz");
        lastNames.add("Brick");

        names.addAll(lastNames);


        names.addAll(1,lastNames);
        System.out.println(names);

        //How to get number of element in a List

        int sizeOfNames = names.size();
        System.out.println(sizeOfNames);

        int sizeOfLast= lastNames.size();
        System.out.println(sizeOfLast);

        //2.Way Java created a method to check if a list is empty or not
        //  isEmpty method returns true if the list has no any element.

        boolean res= lastNames.isEmpty();
        System.out.println(res);




    }
}
