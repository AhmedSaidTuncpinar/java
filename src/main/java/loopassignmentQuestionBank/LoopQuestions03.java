package loopassignmentQuestionBank;

public class LoopQuestions03 {

    public static void main(String[] args) {



        // Example 1: Type code to find the multiplication of the integers from 3 to 9
        // 1. Way
        int i=1;
        for (int j = 3; j<10 ; j++) {

            i= i*j;

        }
        System.out.print(i);

        System.out.println();

        //2. Way

        int m=1, n= 3;
        while (n<10){
            m=m*n;
            n++;
        }
        System.out.print(m);

        //3. Way
        System.out.println();

        int x =1, y=3;

        do {
            x=x*y;
            y++;
        }while (y<10);{

            System.out.println(x);
        }

    }
}
