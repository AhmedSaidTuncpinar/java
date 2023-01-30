package day07stringmanipulations;

public class StringManipulations04Review {

    public static void main(String[] args) {

        String str = "Java is Object Oriented Programming Language";
       String result= str.replace("Object Oriented Programming", "OOP");
        System.out.println(result);

        String str1 = "Mehmed is 14 years old, Hamid is 9 years old and Enis 6 years old.";
       String res =  str1.replaceAll("[0-9]","#");
        System.out.println(res);

           /*
                Regex means Regular Expressions. interview question.
                Regex represents a group of data.
                All digits: [0-9]
                All lowercase letters: [a-z]
                All uppercase letters: [A-Z]
                All lower and uppercase letters: [a-zA-Z]
                All lower and uppercase letters and digits: [a-zA-Z0-9]
                Some multiple characters like a,e, i, o, u: [aeiou]
                All characters different from digits: [^0-9]
                All characters different from letters: [^a-zA-Z]
                All characters different from vowels: [^aeiou]

                Space character: \\s
                All characters different from space character: \\S

                All digits: \\d
                All characters different from digits: \\D

                All uppercase, lowercase letters and digits and _: \\w
                Different from All uppercase, lowercase letters and digits and _: \\W

                All punctuation marks: \\p{Punct}

                 */

         /*  Example 2: Type code to check if a password is valid or not for the following conditions;
        Password must have at least 8 characters different from space character
        Password must have at least 1 symbol

          */

        String pwd = "Ast081316.@ ";
       boolean rule1=  pwd.replaceAll("\\s", "").length()>7;
       boolean rule2= pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println(rule1 && rule2);

    }
}
