package day07stringmanipulations;

public class StringManipulations06 {

    public static void main(String[] args) {
         String str= "String is a non-primitive type in Java";
         boolean result1 = str.isEmpty();

         /* isEmpty() method returns true if the String does not have any character,
        returns false if the string has any character.

        str.length()==0 is the same isEmpty() but use the related method.
          */
        System.out.println(result1);

        boolean result2 = str.isBlank();
        System.out.println(result2);

        /*

        isEmpty("")==>true, isEmpty(" ")==>false
        //isBlank("")==>true, isBlank(" ")==>true
               */
        //Example 1. Check if a string has just letters and spaces in it.

        String s = "Learn Java earn money";
        boolean res = s.replaceAll("[A-Za-z ]","").isEmpty();
        System.out.println(res);

        //Example 1. Check SSN for the following rules
        // 1. it must have just digits
        // 2. it must have 9 digits

        String ssn = "123A45678";
        boolean firstRule = ssn.replaceAll("[0-9]", "").isEmpty();
        boolean secondRule = ssn.length()==9;

        if (firstRule && secondRule) {
            System.out.println("valid ssn");
        }else{
            System.out.println("Invalid ssn");
        }
    }
}
