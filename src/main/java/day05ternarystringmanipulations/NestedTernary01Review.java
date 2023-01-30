package day05ternarystringmanipulations;

public class NestedTernary01Review {

    public static void main(String[] args) {

/*
                Type java code by using nested ternary.
                Write a program to check if a year is "leap year" or not.
                i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
                ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
        */

        int year = 2000;
        String result = year%100==0 ? (year%400==0 ? "Leap": "It is not leap" ) : (year%4==0 ? "leap": "It is not Leap");
        System.out.println(result);

          /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
       */

        String pswd = "imKs1234@.";
       String isValid = pswd.length()>8 ? (pswd.charAt(0)=='i' ? "valid" : "invalid") : (pswd.charAt(0)=='K' ? "valid" : "invalid");
        System.out.println(isValid);
    }
}
