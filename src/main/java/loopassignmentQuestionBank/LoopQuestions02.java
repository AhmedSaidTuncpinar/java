package loopassignmentQuestionBank;

public class LoopQuestions02 {

    public static void main(String[] args) {

       // Type code to find the sum of the integers from 3 to 14
        //1.way
        int  sum = 0;
        for (int i = 3; i <=14 ; i++) {
            sum = sum + i;

        }
        System.out.println(sum);

        //2. way
        int sum2= 0;
        int res=3;

        while (res<=14){

            sum2= sum2 + res;
            res ++;
        }
        System.out.println(sum2);

        //3.Way

        int j = 0;
        int k= 3;

        do {
            j = j +k;
            k++;
        }while (k<15);{

            System.out.println(j);


        }

    }
}
