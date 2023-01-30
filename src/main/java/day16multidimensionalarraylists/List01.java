package day16multidimensionalarraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List01 {

    public static void main(String[] args) {

        //When you create an array, you have to declare the length of the Array.
        // When you use Lists no need to declare the number of elements at the beginning
        //Lists are flexible for length but Arrays are not.
        //Lists are for storing multiple data in the same data type.
        //Lists store non-Primitive data types. Arrays can not store it.
        //Lists can not store primitive data types.
        //Lists have many useful methods. Arrays do not.
        //Arrays are so fast and arrays uses less memory.

        //How to create a List(Arraylist)
        //There are 3 ways to create
        // 1. Way

        ArrayList<Integer> myList= new ArrayList<Integer>();

        //2. Way
        ArrayList<Integer> myList1= new ArrayList<>();

        //3. Way short and preferable

        List<Integer> myList2= new ArrayList<>();

        //4. Another way with Array.asList() method

        List<Integer> list= Arrays.asList(12, 11, 51, 34, 43);
        System.out.println(list);

        //How to print a List on the console. just put its name to print it. it is enough.

        System.out.println(myList2);

        // How to add an element into a List

        //Note: Add() method puts the elements in insertion order.

        myList2.add(12);
        myList2.add(7);
        myList2.add(23);

        //How to add an element into a specific index
        myList2.add(1, 50);
        myList2.add(3, 99);
        System.out.println(myList2);

        //How to join two lists?

        List<String> a =new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b =new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);

        System.out.println(a);

        a.addAll(1, b);
        System.out.println(a);

        //How to get number of element in a List
        int sizeOfA = a.size();
        System.out.println(sizeOfA);

       int sizeOfB= b.size();
        System.out.println(sizeOfB);

        //Note: when you talk about the number of elements in an Array use "Length" of the array. for the lists use "size" of the list.

        //Example 1. Type code to check if the given list is empty or not?
        List<Character> c= new ArrayList<>();
        c.add('x');
        c.add('y');
        // 1. Way
        int sizeOfC = c.size();

        if (sizeOfC==0){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }
        // 2. Way Java created a method to check if a list is empty or not
       //  isEmpty method returns true if the list has no any element.
        boolean isEmpty = c.isEmpty();

        if (isEmpty){
            System.out.println("The list is empty");
    } else{
        System.out.println("The list is not empty");

    }
        //Note: if java has a method for specific functionality using the method is preferable.

        //Example 2: Type code to check if the list does not have any element different from space or the list does not have any element
//           [] ==> Acceptable        [ , , ] ==> Acceptable       [a] ==> Not Acceptable    ...


        List<String> d= new ArrayList<>();
        d.add(" ");
        d.add("a");
        System.out.println(d);

        // to be able to use removeAll() method you need list, therefore we created a list contains space character.
        List<String> e= new ArrayList<>();
        e.add(" ");
        //removeAll() method is used to remove multiple elements from a list.
        //When you use removeAll() method, you will need a list stores the elements you want to remove.
        d.removeAll(e);
        System.out.println(d);

        if (d.isEmpty()){
            System.out.println("The list is empty has just space character");
        }else {
            System.out.println("The list has characters different from space. ");
        }
    }
}