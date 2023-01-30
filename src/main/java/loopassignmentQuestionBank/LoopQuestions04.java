package loopassignmentQuestionBank;

public class LoopQuestions04 {

    public static void main(String[] args) {

        // Type code to print characters from 'C' to 'A' on the console by using loop.
        //1. Way:

        String chr="";
        for (char i= 'C'; i>='A'; i--){
            chr = chr  + i;
        }
        System.out.println(chr);


        //2. Way

        String str="";
        char ch= 'C';

        while (ch>='A') {
            str = str +ch;
            ch--;
        }

        System.out.println(str);
        {

        }
        //3. Way

        String stri= "";
        char cha= 'C';

        do {
            stri = stri + cha;
            cha--;
        }while (cha>='A');
        System.out.println(stri);



    }
}
