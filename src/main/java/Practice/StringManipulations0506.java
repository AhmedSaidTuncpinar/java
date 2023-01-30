package Practice;

public class StringManipulations0506 {

    public static void main(String[] args) {

        /*
        Create a String variable and print just the last non-space character on the console for any String.
        Example: For ‘Ali Can’ you should print n
        For ‘Miami ’ you should print i etc.

         */
        String lastC = "Ali Can";
        char result = lastC.charAt(6);
        System.out.println(result);

        /*
        Create a String variable and find the sum of the ASCII values of the first and the last characters of the String.


         */
        String str = "I love hot chocolate";

       String rslt1= str.substring(0,1);

       char rslt= str.charAt(19);

        System.out.println("Total ascii value is " + (rslt1 + rslt));
    }
}
