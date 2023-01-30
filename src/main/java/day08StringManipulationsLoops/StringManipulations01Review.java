package day08StringManipulationsLoops;

public class StringManipulations01Review {

    public static void main(String[] args) {


          /*
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

      Type code to find the sum of the shirt and book prices.


         */

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String shirt = shirtPrice.replace("$", "");
        String book = bookPrice.replace("$", "");

        Double svalue= Double.valueOf(shirt);
        Double bvalue= Double.valueOf(book);

        System.out.println("Total value is "+ (svalue + bvalue));


        /*
        INTERVIEW Question

        example 2: Swap the integers
        a=12 b=23 ==> a=23 b= 12
         */

        //1. way:

        int a= 12, b=23;
        int t=0;
        t=b;
        b=a;
        a=t;
        System.out.println(a);
        System.out.println(b);
        //2. way:

        int x=14, y=25;
        y= y-x; // y= 25-14 ==> 9
        x= y+x; // x= 9+14 ==> 25
        y= x-y; // y= 25-9 ==> 14

        System.out.println(x);
        System.out.println(y);



    }
}
