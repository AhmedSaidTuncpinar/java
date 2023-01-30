package empty;

import java.util.Arrays;
import java.util.HashMap;

public class Times10 {

    public static void main(String[] args) {


        //Example 1: Type code to print the number of occurrences of words in a sentence

        //1. step Create your string

        String str= "I like, like like, it, it it!";

        //2. step create your string to remove punctuations and print them on the console.

        str=str.replaceAll("\\p{Punct}", "");
        System.out.println(str);

        //3. step create an array to split the words one by one. Because we need words not sentences. and then print it on the console.

        String [] arr= str.split(" ");
        System.out.println(Arrays.toString(arr));

        //4. Step Create your HashMap to put the words with their values. We will get the element by using loop and check it. if it exists instide the map, we will put the value as 1.
        // if one of them exist we will not touch the key, we will increase the value +1.

        HashMap<String, Integer> wrds= new HashMap<>();

        //5. Step Create for each loop to get the elements from  an Array one by one and check them.

        for (String w: arr){

            //6.Step Create an integer container. because we will get the value of every element in our map. Their value will be "null" because our map is empty.

             Integer nums= wrds.get(w);


             //7. step check the entries whether they are repeated or not.

             if (nums==null){

                 wrds.put(w, 1);
             }else{
                 wrds.put(w, nums +1);
             }
        }

        System.out.println(wrds);
    }
}
