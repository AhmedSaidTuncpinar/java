package day05ternarystringmanipulations;

public class Ternary01Review {

    public static void main(String[] args) {

        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        // 1. way
       int a= 12;
       if (a>0){
           System.out.println("The integer is positive");
       }else{
           System.out.println("The integer is not positive");
       }

       //2. Ternary
        String result= a>0 ? "The integer is positive" : "The integer is not postive";
        System.out.println(result);

        //Type a program to print the minimum of 2 doubles on the console. Use ternary...
        // 12, 23 ==> 12         345, 23 ==> 23       -12, -3 ==> -12

        double i= 3.99, s=2.99;
        double min= i<s ? i : s;
        System.out.println(min);

        //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1
        double f = 0;
        double abs= f<0 ? f*-1 : f;
        System.out.println(abs);

        //You have 2 integers;
        //If both of the integers are positive do multiplication.
              //  Otherwise, return "I do not know how to multiply"

        int x = 9, z=18;
        Object xz= x>0 && z>0 ? x*z:"I do not know how to multiply";
        System.out.println(xz);

    }
}
