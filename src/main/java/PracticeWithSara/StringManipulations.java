package PracticeWithSara;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {


    //Type code to reverse a string.
    //    Tom Hanks==> sknaH moT

    String str = "Tom Hanks";
    String str1= "";
    for (int i =str.length()-1; i>=0;i--){

        char cha= str.charAt(i);
        str1= str1 + cha;

    }
        System.out.println(str1);

    //Get the initial from full name. Middle none is out of scope.
        String fullname= "Tom Hanks";
        String initalFirstName= fullname.trim().substring(0,1).toUpperCase();
        System.out.println(initalFirstName);
        String initialLastName=fullname.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(initialLastName);


        ///*
        //    Username is "admin", Password is "pwd123"
        //    Ask user to enter username and password
        //    User should see "Enter your username and password" message
        //    If user enters correct credentials, he should get "You are in your account!" message
        //    Otherwise, he should see "Enter your username and password" message 3 times
        //    After 3 times he should get "Your account is blocked" message
        //*/

        Scanner input = new Scanner(System.in);
        int counter= 0;

        do {
            if (counter==3){
                System.out.println("Your account is blocked");
                break;
            }

        System.out.println("Enter your user name");
        String userName= input.next();

        System.out.println("Enter your password");
        String password= input.next();

        counter++;
        if (userName.equals("admin") && password.equals("pwd123")){
            System.out.println("you are in your account");
            break;
        }
    }while (true);
}
}

