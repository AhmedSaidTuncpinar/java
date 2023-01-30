package Practice;

import java.util.Scanner;

public class Q01_IfStatement {
/*
If the score is less than 50 then you will fail
If the score is greater than 50 then you will pass,

If the score is less than 50 then you will fail otherwise you will pass.(this way is better as it is shorter)
here only one condition will be checked.

if the first part is true then the first action will occur but
if the first condition is false then the second action will occur,this is the logic of "if else".
 */
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Score Please");
    Integer score = input.nextInt();
    if(score<50){
        System.out.println("You failed");
    }else if((score>=50) && (score<=100)){
        System.out.println("You passed");
    }else if((score<=0) || (score>100)){
        System.out.println("Enter a valid score");
    }



}
}
