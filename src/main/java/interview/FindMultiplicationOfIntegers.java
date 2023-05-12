package interview;

import java.util.Scanner;

public class FindMultiplicationOfIntegers {
    public static void main(String[]args){
        //Find the multiplication of Integers from 2 to 9.
        int mltply= 1;
        for (int i=2; i<10; i++){
            mltply= mltply * i;
        }
        System.out.println(mltply);








        //Find the multiplication the integer from 8 to 12
        int numb= 1;
        for (int i=8; i<13; i++){
            numb= numb * i;
        }
        System.out.println(numb);


        System.out.println();


        //Find multiplication of integers from 87 to 89.
        int bmx= 1;
        for (int i=87; i<90; i++){
            bmx = bmx * i;
        }
        System.out.println(bmx);




        //Find multiplication of integers from 80 to 89;
        int ast= 1;
        for (int i=80; i<89; i++){
            ast= ast * i;
        }
        System.out.println(ast);

        System.out.println();

        //find multiplication of integers from 1 to 10

        int num= 1;
        for (int i=1; i<11; i++){
            num= num * i;
        }
        System.out.println(num);


        System.out.println();
        //Find multiplication of integers from 17 to 27;
        int t= 1;
        for (int i=17; i<28; i++ ){
            t= t * i;
        }
        System.out.println(t);
        System.out.println();




        //find multiplication of integers from 6 to 8.
        int rmd= 1;
        for (int i=6; i<9; i++){
            rmd= rmd * i;
        }
        System.out.println(rmd);

        //Find multiplication of given integers from 6 to 11.
        int giv=1;
        int civ;
        int tiv;
        Scanner input= new Scanner(System.in);
        System.out.println("Input an initial Integer");
        civ= input.nextInt();
        System.out.println("Input a final Integer");
        tiv=input.nextInt();

        for (int i=civ; i<tiv; i++){
            giv= giv * i;
        }
        System.out.println(giv);
    }

}
