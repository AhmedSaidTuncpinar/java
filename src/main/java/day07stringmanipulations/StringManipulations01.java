package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

         /*
                Strings are non-primitive, non-primitives have values and methods in them.

            1) equals() method compares two Strings by not ignoring cases
               "Tom".equals("tom"); ==> false
               equals() method returns "boolean"
            2)equalsIgnoreCase() method compares two Strings by ignoring cases
             "Tom".equalsIgnoreCase("tom"); ==> true
             equalsIgnoreCase() method returns "boolean"
            3)toLowerCase() method converts all characters in a String to lower cases
               "AuGuSt".toLowerCase(); ==> august
               toLowerCase() method returns String
            4)toUpperCase() method converts all characters in a String to upper cases
               "AuGuSt".toUpperCase(); ==> AUGUST
               toUpperCase() method returns String
            5)charAt() method gives you a character in the String by using index
               "Java is my love".charAt(2); ==> v
               "Java is my love".charAt(6); ==> s
               charAt() method returns char
            6)length() method returns the number of characters in a String
               "Learn Java earn money".length(); ==> 21
               length() method returns integer
         */

        // 1. Example: Print the first and the last character of the given String on the console. Java is easy ==> jy

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();
        // 1. Way by using charAt() Method
       char firstChar = str.charAt(0);
       char lastChar = str.charAt(str.length()-1);
        System.out.println(firstChar + lastChar);
        //the result will be 162 because if you use char data type in a math operation,
        //java uses ASCII values not the characters.
        System.out.println(" " + firstChar + lastChar);//When you put "" empty string at the beginning it will be
        //cancatenation operation and you will get String.

        // 2. Way by using substring()method
        String firstCharacter = str.substring(0,1);//substring 0,1 gives you first character everytime.
        String lastCharacter = str.substring(str.length()-1);// substring(beginning index) gives you
        //characters from a specific index to the last index.
        System.out.println(firstCharacter + lastCharacter);

        // 2. Example: Print just the animal names from the String; "I like lion, horse, laptop and cat".

        String s = "I like lion, horse, laptop and cat";
        String lion = s.substring(7,11);
        String horse = s.substring(13,18);
        String cat = s.substring(31);
        System.out.println(" " +lion + horse + cat);

        // 3. Example Type code to get initials of first name and the last name of a given name. Ali Can ==> AC.
        String name = "Tom Hanks";
        String initialOfName = name.substring(0,1);
        String initialOfLastName = name.split(" ")[1].substring(0,1);
        System.out.println(initialOfName + initialOfLastName);

        //4. Example: Tyepe code to find the number of words in a String;  I like to move it, move it ==>7

        String word = "I like to move it, move it";
        int numOfWord = word.split("",5).length;
        System.out.println(numOfWord);
    //Note: if you use length after split method do not use parenthesis,
        //when you use it for Strings put paranthesis after the length.

    }
}
