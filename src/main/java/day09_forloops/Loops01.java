package day09_forloops;

public class Loops01 {

    public static void main(String[] args) {
        // Type code to reverse a String. Example; Mark ==> kraM

        String name= "Bernard";
        for (int i = name.length()-1; i>=0 ; i--) {
            char ch= name.charAt(i);

            System.out.print(ch + "");
        }
        //improved one:
        System.out.println();


        String na= "Frederick";
        String nm= "";
        for (int i =na.length()-1; i>=0; i--) {

            char cha= na.charAt(i);
            nm = nm + cha;

        }
        System.out.print(nm + "");
        System.out.println();
        ////Example 3: Find the sum of the integers from 3 to 6
        int sum= 0;
        for (int i = 3; i <7 ; i++) {
            sum = sum +i;
        }
        System.out.println(sum);

        ////Example 3: Find the multiplication of the integers from 3 to 6

        int sum1= 1;
        for (int i = 3; i<7 ; i++) {
            sum1 = sum1 * i;
        }
        System.out.println(sum1);
        System.out.println();
        //Interview Question
        //Example 4: Type code to find the sum of the digits of an integer
        //           584 ==> 5+8+4=17
        //To find last digit of an integer you will use always modulus to get it.
        ////Note: "number % 10" gives you the last digit

        int num = -584;
        num = Math.abs(num);
        int sumOfDigits = 0;
        for(int i=num; i>0; i=i/10){
            sumOfDigits = sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);

    }
}


