package day08StringManipulationsLoops;


public class StringManipulations01 {

    public static void main(String[] args) {


        String str = "Java is easy. Java is OOP.";
        String result1 = str.replaceFirst("Java","Apex");
        System.out.println(result1);

        /*
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

      Type code to find the sum of the shirt and book prices.


         */
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

       String shirt =  shirtPrice.replace("$", "");
        System.out.println(shirt);
        String book = bookPrice.replace("$","");
        System.out.println(book);

        //valueOf() method converts String data type to numeric dada types.
        // to be able to use valueOf() method, String must be in numeric format.

       Double shirtInDouble = Double.valueOf(shirt);
       Double bookInDouble = Double.valueOf(book);
        System.out.println("Total Price is " + (shirtInDouble + bookInDouble));


        /*
        INTERVIEW Question

        example 2: Swap the integers
        a=12 b=23 ==> a=23 b= 12
         */
    //1. way: we used third variable
        int a= 12, b=23;
        int temp= 0;
        temp = b;
        b = a;
        a= temp;
        System.out.println(a);
        System.out.println(b);

        //.2 way without using third variable
        int x = 14, y=25;
        y = y -x;
        x= y+ x;
        y= x-y;

        System.out.println(x);
        System.out.println(y);

    }
}
