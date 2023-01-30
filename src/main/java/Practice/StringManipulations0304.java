package Practice;

public class StringManipulations0304 {

    public static void main(String[] args) {

        /*
        Create a String variable,
        print the total number of alphabetical and numeric characters in the String on the console.
        Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.


         */

        String alpha= "Miami 33018!!! ";
        int numeric= alpha.replaceAll("\\W","").length()-1;
        System.out.println("Total is " + numeric);

        /*

        Create a String variable,
        print the number of non-digit characters in the String on the console.
        Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
         */
        String str= "1a3Bcf4!...";
        int ndigit= str.replaceAll("\\d", "").length();
        System.out.println(ndigit);

    }
}
