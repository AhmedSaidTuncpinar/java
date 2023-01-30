package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations01Review {
    public static void main(String[] args) {

        // 1. Example: Print the first and the last character of the given String on the console. Java is easy ==> jy
        // 1. way
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str= input.nextLine();
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
       System.out.println("" + firstChar + lastChar);
        //2. way
        String firstcharacter = str.substring(0,1);
        String lastcharacter = str.substring(str.length()-1);
        System.out.println(firstcharacter+lastcharacter);

        // 2. Example: Print just the animal names from the String; "I like lion, horse, laptop and cat".

        String animalName= "I like lion, horse, laptop and cat";
       String lion = animalName.substring(7,11);
      String horse = animalName.substring(13,18);
        String cat = animalName.substring(31);
        System.out.println(lion +" "+ horse +" "+ cat);

        // 3. Example Type code to get initials of first name and the last name of a given name. Ali Can ==> AC.
        String initial = "Tom Hanks";
        char firstName = initial.charAt(0);
        char lastName = initial.charAt(4);
        System.out.println("" +firstName + lastName);

        // 4. Example. Type code to get just name and last name of the person in a given sentence.

        String ntl = "Suleyman Alptekin is a good teacher";
        String firstNames = ntl.substring(0,8);
        String lastNames = ntl.substring(9,17);
        System.out.println(firstNames + " " +lastNames);

        //5. Example: Tyepe code to find the number of words in a String;  I like to move it, move it ==>7

        String numberWords = "I like to move it, move it";
        int intWords = numberWords.split(" ").length;
        System.out.println(intWords);

        String myName = "Ahmed Said Tuncpinar";
        int ahm = myName.length()-1;
        System.out.println(ahm);
    }
}
