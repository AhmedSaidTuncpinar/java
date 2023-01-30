package day07stringmanipulations;

public class StringManipulations06Review {

    public static void main(String[] args) {

        String str = "String is a non-primitive data type.";
        boolean res= str.isEmpty();
        System.out.println(res);

        boolean res1 = str.isBlank();
        System.out.println(res1);

        //Example 1. Check if a string has just letters and spaces in it.

        String str1 = "Learn Java, Earn Money";
        boolean res2 = str1.replaceAll("[a-zA-Z]", "").isEmpty();
        System.out.println(res2);

        //Example 1. Check SSN for the following rules
        // 1. it must have just digits
        // 2. it must have 9 digits

        String ssn = "66265268326";
        boolean res3 =ssn.replaceAll("[0-9]","").isEmpty();
        boolean res4 = ssn.length()<10;

        if (res3 && res4){
            System.out.println("SSN is Valid");
        }else{
            System.out.println("SSN is Invalid");
        }
    }
}
