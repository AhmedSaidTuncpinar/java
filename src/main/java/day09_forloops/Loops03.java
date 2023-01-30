package day09_forloops;

public class Loops03 {

    public static void main(String[] args) {


        //Example 1. type code to print characters except m in a string. such as: andromeda==> androeda.

        String str = "Andromeda";

        for (int i = 0; i<str.length(); i++){

            char ch= str.charAt(i);

            if (ch!='m'){
                System.out.print(ch);
            }
        }
        System.out.println();
        String str1 = "Mama";
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch=='m'){
                continue;///If you want to skip any value in loop, use "continue".
    }
            System.out.print(ch);
}
        System.out.println();
        //Example 2: Type code to print characters before "m" in a String
        String city = "Luxembourg";
        for(int i=0; i<city.length(); i++){
            char ch = city.charAt(i);
            if(ch=='m'){
                break;//If you want to break any loop under some conditions, you can use "break" keyword
            }
            System.out.print(ch);
        }

        System.out.println();

        //continue: skips the specific value and goes on processing for the remaining characters
        // break : stops the loop once the condition is valid and leaves the other values without processing.
    }
}