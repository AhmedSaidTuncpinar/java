package studysessiongroup;

public class Meeting06_Q05 {

    public static void main(String[] args) {


        //Q05. Type code to print unique characters in a String. Hello ==> Heo.

        //Step 1. Create a string value.

        String s = "Hello";

        //Step 2. Create for loop to get every char one by one. We will use decrement because we need to start from the left.

        for(int i=0; i<s.length(); i++){

            //Step 3. Create  if statement to check if the characters of a string repeated or not.
            // We will use index of () method to reach the first occurrence of the character.
            // We will also use charAt () method to reach the specified index of the char.
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
        }
    }
}
