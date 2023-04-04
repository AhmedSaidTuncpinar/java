package interview;

public class FindMultiplicationOfIntegers {
    public static void main(String[]args){
        //Find the multiplication of Integers from 2 to 9.
        int mltply= 1;
        for (int i=2; i<10; i++){
            mltply= mltply * i;
        }
        System.out.println(mltply);
    }

}
