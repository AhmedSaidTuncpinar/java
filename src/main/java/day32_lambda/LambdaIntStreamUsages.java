package day32_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaIntStreamUsages {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);

        getSumOfAllElements(l);
        System.out.println();
        getSumOfIntFrom7to100A();
        System.out.println();
        getSumOfIntFrom7to100B();
        System.out.println();
        getMultiplicationOfIntFrom2to11();
        System.out.println();
        findFactorial(-1);
        System.out.println();
        sumOfEvenInGivenRange(4,13);
        System.out.println();
        getSumOfDigitsOfInteger(23,25);
        System.out.println();
    }
    //1. Create a method to find the sum of all elements in the list.

    public static void getSumOfAllElements(List<Integer> l) {

        Integer sum = l.stream().reduce(0, Math::addExact);
        System.out.println(sum);
    }

    //1) Create a method to find the sum of the integers from 7 to 100.
    //1. Way
    public static void getSumOfIntFrom7to100A() {

        Integer sum = IntStream.range(7, 101).reduce(0, Math::addExact);//When you use reduce method it is terminal method. no method
        System.out.println(sum);//5029

    }

    //2. Way
    public static void getSumOfIntFrom7to100B() {

        Integer sum = IntStream.rangeClosed(7, 100).sum();
        System.out.println(sum);//5029
    }

    //3)Create a method to find the multiplication of the integers from 2 (inc) to 11 (inc).
    public static void getMultiplicationOfIntFrom2to11() {
        Integer result = IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
        System.out.println(result);//39916800

    }
    //4.Create a method to calculate the factorial of a given number. (5! ==> 1*2*3*4*5). Interview Question

    public static void findFactorial(int x) {

        Integer result = 0;

        if (x < 0) {
            System.out.println("Do not use negative numbers...");

        } else {
            result = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
            System.out.println(result);//720
        }
    }
    //5. Create a method to calculate the sum of even integers between given two integers

    public static void sumOfEvenInGivenRange(int s, int e){

       Integer sum = IntStream.rangeClosed(s,e).filter(UtilsClass::checkToBeEven).sum();
        System.out.println(sum);
    }

    //6. Create a method to calculate the sum of digits of every integer between two given integers
    //    // 23 and 32 ==> 2+3  2+4 .... 3+2

    public static void getSumOfDigitsOfInteger(int s, int e){
       Integer result =  IntStream.rangeClosed(s, e).map(UtilsClass::getSumOfDigits).sum();
        System.out.println(result);

    }
}

