package day08StringManipulationsLoops;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example: type code to print "Hi" five times on the console.
        // first way there is repition, difficult to type and difficult to maintain and update.. Not recommended.

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // 2. Way : to do repeated actions Java created Loops.There are 4 loops in java.
        // 1. for-loop, while-loop, do-while-loop, for-each-loop

        // 1) for-loop
        // starting value, Condition Increment/decrement
        //Increment means to increase the value
// 1.Way: int i = 2; ==> i = i + 5; ==> i = 7;
// 2.Way: int k = 3; ==> k= k*2; ==> k =6;
// i+ = 5; ==> means (int  i = 2; ==> i = i + 5; ==> i = 7;) ==>They are same
// k* = 2; ==> means (int k = 3; ==> k= k*2; ==> k =6;) ==> same

//To increase by 1 has a specific syntax
//int m = 7;   ==> m++;   ==> m = m+1; ==>   m+ = 1; They are same. That syntax can be used only plus 1.

//Decrement means to decrease values of a variable
//1.Way: int i = 12;  ==> i = i-7;  ==> i=5;
//2.Way: int k=6; ==> k=k/2;  ==> k=3;
// i- = 7; same meaning
// k/ = 2; same meaning

//To decrease any value by 1 we have a specific syntax
//int m = 10; ==> m--; ==> m+m-1;  ==> m- =1; ==> They are same. That syntax can be used only minus 1.

        for ( int i= 1  ; i<6  ; i++   ){
            System.out.println("Hi");
        }

        //2.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers.
        // IT developers i for int name in loops generally. do not be different.

        for ( int i=11   ; i<45     ; i++    ) {
            System.out.print(i + " ");

        }
        System.out.println();
        //3.Example: Type all integers from 44 to 11 in the same line with a space between consecutive integers.

        for (int i= 44; i>10; i--)
            System.out.print(i + " ");

        System.out.println();


        //4.Example: Type even (divisible 2) integers from 11 to 44 in the same line with a space between consecutive integers.

        for (  int i=11   ;  i<45      ;  i++     ){

            if (i%2==0){

                System.out.print(i + " ");


            }
        }
        System.out.println();
        //5.Example: Type odd (divisible 3) integers from 68 to 13 in the same line with a space between consecutive integers.

        for (    int i = 68     ;  i>12        ;   i--       ){

            if (i%2!=0){

                System.out.print(i + " ");
            }
        }
        System.out.println();
        //6.Example: Type all integers which are divisible by 4 and not disible by 6 from 120 to 11 in the same line with a space between consecutive integers.

        for (    int i = 120      ;   i>10        ;   i--      ){

            if (i%4==0 && i%6!=0) {

                System.out.print(i+ " ");
            }
        }
    }
}
