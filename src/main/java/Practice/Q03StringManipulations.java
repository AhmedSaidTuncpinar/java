package Practice;

public class Q03StringManipulations {

    public static void main(String[] args) {

        /*

        String shirtPrice= "$  12.99";
        String bookPrice= "$  35.99";
        type a code to find the sum of the shirt and book prices.

         */

        String shirtPrice= "$  12.99";
        String bookPrice= "$  35.99";

        String shirt= shirtPrice.replace("$", "");
        String book= bookPrice.replace("$", "");
        //How can I convert String to Double. I should use Double wrapper class and put dot.
        //We can convert to String to Double numeric values. Because it is not possible to operate math operations
        //with strings.

        double sd=Double.valueOf(shirt);
        double bp=Double.valueOf(book);
        System.out.println(sd + bp);

    }
}
