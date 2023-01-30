package Day06;

import java.util.Scanner;

public class ModulusOperator01 {

    public static void main(String[] args) {


        System.out.println("Enter a 3 digits number: ");
        Scanner threeDigitsNumber= new Scanner(System.in);
        int absThreeDigitsNumber= threeDigitsNumber.nextInt();

        int last= absThreeDigitsNumber%10;
        absThreeDigitsNumber=absThreeDigitsNumber/10;

        int second= absThreeDigitsNumber%10;

        absThreeDigitsNumber= absThreeDigitsNumber/10;
        int first= absThreeDigitsNumber%10;

        System.out.println(last + second+ first);
    }
}
