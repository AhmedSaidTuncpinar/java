package loopassignmentQuestionBank;

public class LoopQuestion01 {

    public static void main(String[] args) {

        /*
        Type all integers which are divisible by 4 and divisible by 6 from 120 to 11
         in the same line with a space between two consecutive integers

         */
        //1. Way:
        for (int i = 120; i>10 ; i--) {

            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }

        }
        System.out.println();
        //2. Way:
        String s = "";
        Integer k=120;
        while(k>10){
            if(k%4==0 && k%6==0) {
                s = s + k + " ";
            }
            k--; }
        System.out.println(s);


        System.out.println();
        //3. Way
        String str= "";
        Integer m = 120;

        do {
            if(m%4==0 && m%6==0) {
                str = str + m + " ";
            }
        m--;
        }while (m>10);
        System.out.println(str);

    }
}
