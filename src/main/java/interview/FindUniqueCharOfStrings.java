package interview;

public class FindUniqueCharOfStrings {
    public static void main(String[]args){
        //Find the unique characters in a string value.
     String str= "Ohlala";
     for (int i=0; i<str.length(); i++)
         if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
             System.out.print(str.charAt(i));
         }

    }
}

