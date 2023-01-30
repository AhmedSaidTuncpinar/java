package PracticeWithSara;

public class LoopExamples {

    public static void main(String[] args) {


    //Type code to check if a given integer is palindrome or not
    //palindrome= the same in normal reading or reverse reading

        String str1= "nalan";
        String reversed= "";
        int idx= str1.length()-1;
        while (idx>-1){
            reversed= reversed+str1.charAt(idx);
            idx--;
        }
        if (str1.equals(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

        System.out.println("===================================================================");
        String strI2= "ey edip adanada pide ye";
        String reversed2= "";

        int idx2=strI2.length()-1;
        while(idx2>-1){
            reversed2=reversed2+ strI2.charAt(idx2);
            idx2 --;
        }
        if (strI2.equals(reversed2)){

            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
/*
1.Take input from the user or initialise it manually (num).
2.Store the input in a new variable (element).
3.Until num is not equal to zero, find the reminder of the num and store it in a variable (reverse).
4.Divide the num by ten and repeat step 3 using a while loop.
5.Check if the element is equal to reverse.
6.If it is equal,
a.Print it is palindrome
bElse print it is not palindrome.
 */
}
}