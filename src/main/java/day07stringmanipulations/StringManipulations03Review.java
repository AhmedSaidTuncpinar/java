package day07stringmanipulations;

public class StringManipulations03Review {

    public static void main(String[] args) {


        String ast = "Ahmed Said Tuncpinar";
        boolean tsa = ast.contains("A");
        System.out.println(tsa);

        boolean aSaid= ast.startsWith("T");
        System.out.println(aSaid);

        boolean ahmedS= ast.startsWith("T",11);
        System.out.println(ahmedS);

         /*
        Check if the given password
        1. has a in any position.
        2. has "xy" at the beginning
        3. has "W" as 7th character
        4. has 8 characters in total


          */
        boolean firstQ = ast.contains("a");
        System.out.println(firstQ);
        boolean secondQ = ast.startsWith("xy");
        System.out.println(secondQ);
       boolean thirdQ = ast.startsWith("W",7);
        System.out.println(thirdQ);
       boolean fourthQ = ast.length()==20;
        System.out.println(fourthQ);

        String lastEx = "Do practice to be better";
       boolean ex = lastEx.endsWith("better");
        System.out.println(ex);
    }
}
