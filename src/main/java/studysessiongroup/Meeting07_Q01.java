package studysessiongroup;

import java.util.Map;

public class Meeting07_Q01 {

    public static void main (String[]args){



    /*
   What do you know about "Collections"?

     Collections are to store and manipulate the group of objects.

    Java Collection provides many interfaces (List, Queue, Set) and classes (ArrayList, LinkedList, PriorityQueue
    , HashSet, LinkedHashSet, TreeSet).

    List=> ArrayList: When we need to store multiple values in a single container we use ArrayList.

           LinkedList: Insert and delete operations in the Linked list are easy
           because adding and deleting an element from the linked list does not require element shifting,
           only the pointer of the previous and the next node requires change.

            When do we use Linked List and ArrayList? Why?

    Queue=> Queue's are for storing multiple non-primitive data in the same data type
            Queue's are used for FIFO(First In First Out)

             Deque's are for storing multiple non-primitive data in the same data type
            "Deque" means "Double Ended Queue", it works successfully in FIFO and LIFO operations.

   Sets => They are for storing multiple non-primitive data in the same data type
            Sets are for storing unique data like email addresses, SSN, Phone Numbers in a Country, ..
            There are 3 different Sets:
            i)HashSet: Uses "Hashing Technique".
               It does not put the elements in any order.
               HashSet accepts just a single "null" as element
            ii)LinkedHashSet: Puts the elements in "Insertion Order"

             When do we use HashSet and LinkedHashSet? why?

            iii)TreeSet: Puts the elements in "Natural Order"(Ascending Order in numbers, Alphabetical Order in Strings)
                                              TreeSet is so slow in adding elements.


Shortly:
    Collections have 3 interfaces==> 1-Lists==>a-array lists and Linked lists//LinkedLists have 3 parent classes : List, Queue and Deque
                                     2-Queues===>a- Priority queue (concrete) b-Deque (interface)
                                     3-Sets=>a- HAshSet (concrete class)
                                             b- LinkedHashSet (concrete class)
                                             c-Sorted interface
                                             d-TreeSet (concrete class under Sorted interface)




     */

    //Create an integer multidimensional array then find the sum of the elements.

    int brr[][] = { {12, 54}, {3, 2, 7}, {21} };
    int sum1 = 0;

        for(int[] w: brr){
        for(int u : w){
            sum1 = sum1 + u;
        }
    }
        System.out.println(sum1);
}
}
