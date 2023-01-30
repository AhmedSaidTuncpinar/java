package studysessiongroup;

import java.util.Arrays;
import java.util.HashMap;

public class Meeting05 {

    //Example 1: Type code to print the number of occurrences of words in a sentence
    //"I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1

    public static void main(String[] args) {

        //1. Step create your string container
        String str= "I like to move it, move it do you like it?";


        //2. Step Remove punctuation marks and print on the console.

         str= str.replaceAll("\\p{Punct}","" );
        System.out.println(str);

         //3. Step Get the words from the sentence by using split() with space. in this step use Arrays to create the sentence without punctuation.

        String [] words= str.split(" ");

        System.out.println(Arrays.toString(words));

        //4. Step Create HashMap container to put every word with a value.

        HashMap<String, Integer> unique =  new HashMap<>();

        //5. Step Create for each loop to check every Entry in to ArrayList.

        for (String w: words){
        //6. Step Create an integer container to change the string value to integer data type.
        Integer nums= unique.get(w);

        //7. Step create if else statement to check the value into for each loop to repeated or not.
            if (nums==null){
                unique.put(w,1);
            }else {
                unique.put(w,nums +1);
            }
        }
        System.out.println(unique);



    }

}
