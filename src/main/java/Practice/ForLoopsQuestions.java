package Practice;

public class ForLoopsQuestions {
    public static void main(String[] args) {

        /*

        Type all integers which are divisible by 4 and divisible by 6 from 120 to 11
        in the same line with a space between two consecutive integers
         */
        for (int i= 120;i>10;i--){

            if (i%4==0 && i%6==0)

                System.out.print(i + " ");
        }


    }
}
