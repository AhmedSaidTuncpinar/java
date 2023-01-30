package day04nestedifswitch;

import java.util.Scanner;

public class Switch01Review {

    public static void main(String[] args) {

        ////Get the number of days from user and print the name of the day
        //        //For example; 1 ==> Sunday, 2 ==> Monday, etc.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for week days");
        byte dayNum = input.nextByte();

        if (dayNum==1){
            System.out.println("Sunday");
        } else if (dayNum==2) {
            System.out.println("Monday");

        } else if (dayNum==3) {
            System.out.println("Tuesday");

        } else if (dayNum==4) {
            System.out.println("Wednesday");

        } else if (dayNum==5) {
            System.out.println("Thursday");

        } else if (dayNum==6) {
            System.out.println("Friday");

        } else if (dayNum==7) {
            System.out.println("Saturday");

        }else {
            System.out.println("Invalid Data");

        }

        switch (dayNum){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Data");

    }

}
}

