package day07stringmanipulations;

public class StringManipulations03 {

    public static void main(String[] args) {

        String str = "Java is easy";

        boolean isExist = str.contains("J");// contains method check the char or word in given sentence.
        System.out.println(isExist);

       boolean  result = str.startsWith("Java");
        System.out.println(result);
        // If you use startWith() method with 2 parameters, second parameter means skip the first characters.
       boolean res =  str.startsWith("i",5);
        System.out.println(res);

        /*
        Check if the given password
        1. has A in any position.
        2. has "xy" at the beginning
        3. has "W" as 7th character
        4. has 8 characters in total


         */

        String pwd= "xy1AmSW?";
        boolean firstRule= pwd.contains("A");
        boolean secondRule= pwd.startsWith("xy");
        boolean thirdRule = pwd.startsWith("W",6);
        boolean fourthRule = pwd.length()==8;
        System.out.println("Is the password valid?" + " " + (firstRule && secondRule && thirdRule && fourthRule));

        String s = "Do practice to be better";
        boolean rslt = s.endsWith("better");
        System.out.println(rslt);

        String t = s.concat("!"); //Concat() method some with the + in java. Both do the same. but using method is better.
        System.out.println(t);

        //İf you use multiple methods side by side it is "called method chain".
         }
}
