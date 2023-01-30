package Practice;

import java.util.Scanner;

public class Q03_IfStatement {

    public static void main(String[] args) {

         /*
         Type java code by using if statement. When you enter the name of the day of a week,
         output will be “Weekday” or “Weekend day” according to the name of the day.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name");
        String day = input.nextLine();

        if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("Thursday")
                || day.equals("Friday")) {
            System.out.println("it is weekday");

        }else if(day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("It is weekend day");
    }else {
            System.out.println("Enter  valid a day name");
}
    }
}