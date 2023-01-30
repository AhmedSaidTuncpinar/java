package studysessiongroup;

public class Meeting06_Q03 {

    public static void main(String[] args) {


        //Q03. Type code to reverse a string.
        //    Tom Hanks==> sknaH moT
        //reverse() is used to reverse a String.
        //If you get a question like "How to reverse a String" tell them;
        //i)I can reverse a String by using reverse() method from StringBuilder Class
        //ii)I can reverse a String by using loops.
        //Interviewer will tell you use the loops

        //1. Step: Create a string container
        String str = "Tom Hanks";

        //2. Step: Create an empty string container to put the new reversed string.
        String str1= "";
        //3. Step: Create for loop to get every single letter one by one from the last char.
        // str.length()-1 gives us the last char of the given string.
        for (int i =str.length()-1;    i>=0;    i--){
            //4. Step: Create a char container to put the char characters in it from the last to first.
            char cha= str.charAt(i);

            //5. Step: To create a string container to put the reversed chars as a string.
            str1= str1 + cha;

        }
        System.out.println(str1);

    }
}
